package com.cloud.service.impl;

import com.cloud.mapper.UserMapper;
import com.cloud.pojo.User;
import com.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 3:01
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void show() {
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }


}
