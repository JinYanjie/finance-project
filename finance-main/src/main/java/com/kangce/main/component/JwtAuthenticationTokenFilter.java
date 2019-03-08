package com.kangce.main.component;

import com.kangce.main.dto.MemberDetails;
import com.kangce.main.service.RedisService;
import com.kangce.main.service.UserService;
import com.kangce.main.util.JwtTokenUtil;
import com.kangce.main.util.TextUtils;
import com.kangce.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Value("${jwt.header}")
    private String header;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userService;



    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String auth_token = request.getHeader(this.header);
        logger.info("AAA header="+header+" auth_token="+ auth_token);

        String userPhone = jwtTokenUtil.getUserPhoneFromToken(auth_token);

        logger.info(String.format("Checking authentication for user %s.", userPhone));

        if (userPhone != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            List<User> byPhone = userService.findUserByPhone(userPhone);
            if(byPhone!=null && byPhone.size()!=0){
                User user = byPhone.get(0);

                if(jwtTokenUtil.validateToken(auth_token,user)){
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, new MemberDetails(user).getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    logger.info(String.format("Authenticated user %s, setting security context", userPhone));
                    SecurityContextHolder.getContext().setAuthentication(authentication);

                    //更新Token
                    jwtTokenUtil.refreshToken(auth_token,user);
                }
            }
        }
        chain.doFilter(request, response);
    }
}
