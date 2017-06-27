package com.canghailongyin.service;

import com.canghailongyin.pojo.User;

import java.util.List;

/**
 * Created by mingyue on 2017/6/27.
 */
public interface UserService {

    void addUser(User user);

    void disableUser(Integer u_id);

    void deleteUser(Integer u_id);

    void updateUser(User user);

    User getUserByID(Integer u_id);

    User getUserByAccount(String u_account);

    List<User> getAllUsers();
}
