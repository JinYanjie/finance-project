package com.kangce.main.interceptor;

import com.kangce.main.annotation.PassToken;
import com.kangce.main.annotation.UserLoginToken;
import com.kangce.main.service.RedisService;
import com.kangce.main.service.UserService;
import com.kangce.main.util.JwtTokenUtil;
import com.kangce.main.util.TextUtils;
import com.kangce.mybatis.model.User;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    UserService userService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Value("${token.expiration}")
    private long expiration;

    @Autowired
    private RedisService redisService;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String token = httpServletRequest.getHeader("Authorization");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if(!(object instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod=(HandlerMethod)object;
        Method method=handlerMethod.getMethod();
        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if (userLoginToken.required()) {
                // 执行认证
                if (token == null) {
                    throw new RuntimeException("无token，请重新登录");
                }
                // 获取 token 中的 user id
                String userphone = jwtTokenUtil.getUserPhoneFromToken(token);
                if(TextUtils.isEmpty(userphone)){
                    throw new RuntimeException("用户不存在，请重新登录");
                }

                List<User> usersByPhone = userService.findUserByPhone(userphone);
                if (usersByPhone == null || usersByPhone.size()==0) {
                    throw new RuntimeException("用户不存在，请重新登录");
                }
                User user = usersByPhone.get(0);

                // 验证 token
//                boolean isValid = jwtTokenUtil.validateToken(token, user);
//                if(!isValid){
//                    throw new RuntimeException("401");
//                }

                String time = redisService.get(token + user.getPhone());
                if(time==null ){
                    throw new RuntimeException("token过期");
                }
                Date lastTime = simpleDateFormat.parse(time);
                long interval = (new Date().getTime() - lastTime.getTime()) / 1000;
                if( interval > expiration){
                    throw new RuntimeException("token过期");
                }

                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }

}
