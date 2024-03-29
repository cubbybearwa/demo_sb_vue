package com.cubbybear.mapper;

import com.cubbybear.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(User user);
    User queryUserByUsername(String username);
}
