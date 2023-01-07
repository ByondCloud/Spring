package com.cloud.service.impl;

import com.cloud.mapper.UserMapper;
import com.cloud.pojo.User;
import com.cloud.service.UserService;

import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/21
 * @Time 15:33
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void show() {
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        System.out.println("hhh");
    }

}
