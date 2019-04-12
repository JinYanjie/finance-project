package com.kangce.main.controller;


import com.kangce.main.dto.CommonResult;
import com.kangce.main.dto.LoginSuccess;
import com.kangce.main.service.RedisService;
import com.kangce.main.service.UserService;
import com.kangce.main.util.JwtTokenUtil;
import com.kangce.main.util.TextUtils;
import com.kangce.mybatis.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Api(tags = "user-controller", description = "用户管理")
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


    @ApiOperation("用户登录")
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
                String token = jwtTokenUtil.generateToken(targetUser);
                LoginSuccess loginSuccess = new LoginSuccess();
                loginSuccess.setToken(token);
                loginSuccess.setUser(targetUser);
                commonResult.success(loginSuccess);

                //存入redis
                redisService.set(token + user.getPhone(), simpleDateFormat.format(new Date()));
            }
        }


        return commonResult;
    }

    @ApiOperation("用户注册")
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
            String token = jwtTokenUtil.generateToken(targetUser);
            LoginSuccess loginSuccess = new LoginSuccess();
            loginSuccess.setToken(token);
            loginSuccess.setUser(targetUser);
            commonResult.success(loginSuccess);

            //存入redis
            redisService.set(token + user.getPhone(), simpleDateFormat.format(new Date()));
        }

        return commonResult;
    }

    @ApiOperation("修改用户权限")
    @PreAuthorize("hasAnyAuthority('superior_administrator')")
    @PostMapping("/userLevelChange")
    public Object updataUserLevel(@RequestParam("userId") int userId,
                                  @RequestParam("newLevel") int newLevel) {

        CommonResult commonResult = new CommonResult();
        if (newLevel < 0 || newLevel > 3) {
            return commonResult.failed("权限值不存在");
        }

        int result = userService.changeUserLevel(userId, newLevel);

        if (result == 1) {
            return commonResult.success(new HashMap<>());
        } else {
            return commonResult.failed("权限设置失败");
        }

    }

    @ApiOperation("获取所有用户")
    @PreAuthorize("hasAnyAuthority('tourist')")
    @PostMapping("/allUser")
    public Object getAllUser() {
        CommonResult commonResult = new CommonResult();

        List<User> userList = userService.getAll();

        return commonResult.success(userList);
    }

    /**
     * 根据id获取用户信息
     */

    @ApiOperation("获取指定id用户信息")
    @PostMapping("/getUser")
    public Object getUserById(@RequestParam("id") int id) {
        CommonResult commonResult = new CommonResult();
        User user = userService.getUserById(id);
        return commonResult.success(user);
    }
}
