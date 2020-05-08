package com.itboot.demo1.service.impl;

import com.itboot.demo1.mapper.UserMapper;
import com.itboot.demo1.pojo.User;
import com.itboot.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
