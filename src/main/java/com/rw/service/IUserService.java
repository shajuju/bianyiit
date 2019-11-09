package com.rw.service;

import com.rw.pojo.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    void saveUser(User user);
}
