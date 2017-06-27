package com.canghailongyin.dao;

import com.canghailongyin.pojo.User;

import java.util.List;

/**
 * Created by mingyue on 2017/6/27.
 */
public interface UserDAO {

    void insertUser(User user);

    void disableUser(Integer u_id);

    void deleteUser(Integer u_id);

    void updateUser(User user);

    User selectUserByID(Integer u_id);

    User selectUserByAccount(String u_account);

    List<User> selectAllUsers();
}
