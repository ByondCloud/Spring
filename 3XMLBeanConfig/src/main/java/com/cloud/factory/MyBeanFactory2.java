package com.cloud.factory;

import com.cloud.dao.UserDao;
import com.cloud.dao.impl.UserDaoImpl;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/16
 * @Time 1:32
 */
public class MyBeanFactory2 {
    public UserDao userDao(String ojbk) {
        return new UserDaoImpl();
    }
}
