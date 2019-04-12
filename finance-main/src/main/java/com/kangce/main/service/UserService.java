package com.kangce.main.service;

import com.kangce.mybatis.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);


    List<User> findUserByid(int uid);


    List<User> findUserByName(String userName);


    List<User> findUserByPhone(String userPhone);


    int changeUserLevel(int userId, int level);

    List<User> getAll();

    User getUserById(int id);
}
