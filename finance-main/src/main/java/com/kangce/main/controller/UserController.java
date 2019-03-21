package com.kangce.main.controller;


import com.kangce.main.annotation.UserLoginToken;
import com.kangce.main.dto.CommonResult;
import com.kangce.main.dto.LoginSuccess;
import com.kangce.main.service.RedisService;
import com.kangce.main.service.UserService;
import com.kangce.main.util.JwtTokenUtil;
import com.kangce.main.util.TextUtils;
import com.kangce.mybatis.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    private RedisService redisService;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @PostMapping("/login")
    public Object login(@RequestParam("phone") String phone, @RequestParam("password") String password) {

        CommonResult commonResult = new CommonResult();

        User user = new User();
        user.setPhone(phone);
        user.setPassword(password);

        List<User> userList = userService.findUserByPhone(user.getPhone());
        if (userList == null || userList.size() == 0) {
            commonResult.validateFailed("登录失败,用户不存在");
        } else {
            User targetUser = userList.get(0);
            if (!targetUser.getPassword().equals(user.getPassword())) {
                commonResult.validateFailed("登录失败,密码错误");
            } else {
                setSuccessToken(commonResult, user, targetUser);
            }
        }


        return commonResult;
    }


    @Transactional
    @PostMapping("/register")
    public Object register(@RequestParam(value = "userName", defaultValue = "") String userName,
                           @RequestParam("phone") String phone,
                           @RequestParam("password") String password,
                           @RequestParam(value = "level", defaultValue = "1") int level,
                           @RequestParam(value = "email", defaultValue = "") String email,
                           @RequestParam(value = "company", defaultValue = "") String company
    ) {

        CommonResult commonResult = new CommonResult();

        User user = new User();
        if (TextUtils.isEmpty(userName)) {
            user.setUsername("用户_" + phone.substring(phone.length() - 3, phone.length()));
        } else {
            user.setUsername(userName);
        }
        user.setPhone(phone);
        user.setPassword(password);
        user.setLevel(level);
        user.setEmail(email);
        user.setCompany(company);

        int num = 0;
        try {
            num = userService.addUser(user);
        } catch (Exception exception) {
            LOGGER.warn("添加用户失败: " + exception.getMessage());
            return commonResult.failed("注册失败,该手机号已存在");
        }

        if (num == 1) {
            User targetUser = userService.findUserByPhone(user.getPhone()).get(0);
            setSuccessToken(commonResult, user, targetUser);
        }

        return commonResult;
    }


    @UserLoginToken
    @GetMapping("/getmessage")
    public Object getMessage() {
        return new CommonResult().success("你已通过验证");
    }

    private void setSuccessToken(CommonResult commonResult, User user, User targetUser) {
        String token = jwtTokenUtil.generateToken(targetUser);
        LoginSuccess loginSuccess = new LoginSuccess();
        loginSuccess.setToken(token);
        loginSuccess.setUser(targetUser);
        commonResult.success(loginSuccess);

        //存入redis
        redisService.set(token + user.getPhone(), simpleDateFormat.format(new Date()));
    }

}
