package com.kangce.main.service.impl;

import com.kangce.main.service.UserService;
import com.kangce.mybatis.mapper.UserMapper;
import com.kangce.mybatis.model.User;
import com.kangce.mybatis.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public int addUser(User user) {
        int num = userMapper.insert(user);
        return num;
    }

    @Override
    public List<User> findUserByid(int uid) {

        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(uid);

        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> findUserByName(String userName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName);

        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> findUserByPhone(String userPhone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(userPhone);

        return userMapper.selectByExample(userExample);
    }

    @Override
    public int changeUserLevel(int userId, int level) {
        User user = userMapper.selectByPrimaryKey(userId);
        user.setLevel(level);

        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }


}
