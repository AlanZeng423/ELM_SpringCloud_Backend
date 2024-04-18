package com.neusoft.service;

import com.neusoft.po.User;

public interface UserService {
    public User getUserByIdByPass(User user);

    public int getUserById(String userId);

    public int saveUser(User user);

    public int updatePoint(User user);

    double getPointById(String userId);
}