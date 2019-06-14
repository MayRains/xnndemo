package com.example.xnndemo.service;

import com.example.xnndemo.dao.UserMapper;
import com.example.xnndemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User loginByName(String username){
        return  userMapper.LoginByName(username);
    }
}
