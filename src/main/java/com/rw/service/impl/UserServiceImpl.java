package com.rw.service.impl;

import com.rw.dao.IUserDao;
import com.rw.pojo.User;
import com.rw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao userDao;

    public List<User> findAll() {
        List<User> userList = userDao.findAll();
        return userList;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

}
