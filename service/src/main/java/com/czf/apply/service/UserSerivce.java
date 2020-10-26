package com.czf.apply.service;

import com.czf.apply.dao.entity.User;
import com.czf.apply.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivce {

    @Autowired
    UserMapper userMapper;

    public User getUser(String code){
       User user= userMapper.selectUserByActiveCode(code);
       return user;
    }
}
