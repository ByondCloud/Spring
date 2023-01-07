package com.cloud.dao.impl;

import com.cloud.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/31
 * @Time 2:10
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("userDao show");
    }
}
