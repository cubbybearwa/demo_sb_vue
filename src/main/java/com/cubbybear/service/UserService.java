package com.cubbybear.service;

import com.cubbybear.pojo.User;

public interface UserService {
    void registerUser(User user);
    User queryuserByUsername(String username);
}
