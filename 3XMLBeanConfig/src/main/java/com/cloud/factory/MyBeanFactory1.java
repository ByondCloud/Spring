package com.cloud.factory;

import com.cloud.dao.UserDao;
import com.cloud.dao.impl.UserDaoImpl;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/15
 * @Time 23:31
 */
public class MyBeanFactory1 {
    //             类名     方法名
    public static UserDao UserDao(String account) {
        return new UserDaoImpl();
    }

}
