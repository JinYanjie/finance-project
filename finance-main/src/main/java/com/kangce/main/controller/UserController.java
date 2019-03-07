package com.kangce.main.controller;


import com.kangce.main.annotation.UserLoginToken;
import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.RedisService;
import com.kangce.main.service.UserService;
import com.kangce.main.util.JwtTokenUtil;
import com.kangce.mybatis.model.LoginSuccess;
import com.kangce.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    private RedisService redisService;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @PostMapping("/login")
    public Object login(@RequestParam("phone") String phone,@RequestParam("passward") String passward) {

        CommonResult commonResult = new CommonResult();

        User user = new User();
        user.setPhone(phone);
        user.setPassword(passward);

        List<User> userList = userService.findUserByPhone(user.getPhone());
        if (userList == null || userList.size() == 0) {
            commonResult.validateFailed("登录失败,用户不存在");
        } else {
            User targetUser = userList.get(0);
            if (!targetUser.getPassword().equals(user.getPassword())) {
                commonResult.validateFailed("登录失败,密码错误");
            } else {
                String token = jwtTokenUtil.generateToken(targetUser);
                LoginSuccess loginSuccess = new LoginSuccess();
                loginSuccess.setToken(token);
                loginSuccess.setUser(targetUser);
                commonResult.setData(loginSuccess);

                //存入redis
                redisService.set(token+user.getPhone(),simpleDateFormat.format(new Date()));
            }
        }


        return commonResult;
    }


    @UserLoginToken
    @GetMapping("/getmessage")
    public Object getMessage() {
        return new CommonResult().success("你已通过验证");
    }

}
