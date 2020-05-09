package com.neuedu.service.impl;

import com.neuedu.mapper.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        /*if(userMapper.selectByUser(user) != null)
            return 1;
        else
            return 0;*/
        return userMapper.selectByUser(user);
    }
}
