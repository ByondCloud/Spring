package com.cloud.factory;

import com.cloud.dao.UserDao;
import com.cloud.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/16
 * @Time 3:05
 */
public class MyBeanFactory3 implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
