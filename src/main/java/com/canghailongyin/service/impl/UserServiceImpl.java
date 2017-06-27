package com.canghailongyin.service.impl;

import com.canghailongyin.dao.UserDAO;
import com.canghailongyin.pojo.User;
import com.canghailongyin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mingyue on 2017/6/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public void addUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    public void disableUser(Integer u_id) {
        userDAO.disableUser(u_id);
    }

    @Override
    public void deleteUser(Integer u_id) {
        userDAO.deleteUser(u_id);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public User getUserByID(Integer u_id) {
        return userDAO.selectUserByID(u_id);
    }

    @Override
    public User getUserByAccount(String u_account) {
        return userDAO.selectUserByAccount(u_account);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.selectAllUsers();
    }
}
