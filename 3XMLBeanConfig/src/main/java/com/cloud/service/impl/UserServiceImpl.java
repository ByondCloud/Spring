package com.cloud.service.impl;

import com.cloud.dao.UserDao;
import com.cloud.service.UserService;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/12
 * @Time 16:46
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;


    // beanfactory去调用该方法，从容器中获得userDao设置到此处
    public void setXxx(UserDao userDao) {
        System.out.println("引用 " + userDao);
        this.userDao = userDao;
    }

}
