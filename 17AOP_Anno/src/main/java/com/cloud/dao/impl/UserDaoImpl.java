package com.cloud.dao.impl;

import com.cloud.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 2:34
 */
@Repository
public class UserDaoImpl implements UserDao {


    @Override
    public void show() {
        System.out.println("UserDao的show方法");
    }
}
