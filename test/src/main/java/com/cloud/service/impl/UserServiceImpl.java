package com.cloud.service.impl;

import com.cloud.dao.UserDao;
import com.cloud.dao.impl.UserDaoImpl;
import com.cloud.service.UserService;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/28
 * @Time 21:01
 */
public class UserServiceImpl implements UserService {


    public void test() {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.show();
    }
}
