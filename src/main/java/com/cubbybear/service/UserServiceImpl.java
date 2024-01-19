package com.cubbybear.service;

import com.cubbybear.mapper.UserMapper;
import com.cubbybear.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

//    private UserMapper userMapper = new UserMapper();
    @Autowired
    private UserMapper userMapper;
    @Override
    public void registerUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User queryuserByUsername(String Username){
        return userMapper.queryUserByUsername(Username);
    }
}
