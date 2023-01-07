package com.cloud.service.impl;

import com.cloud.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 22:56
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void show1() {
        System.out.println("show1");
    }

    @Override
    public void show2() {
        System.out.println("show2");
    }
}
