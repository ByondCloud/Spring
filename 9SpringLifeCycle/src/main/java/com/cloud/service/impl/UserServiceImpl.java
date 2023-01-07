package com.cloud.service.impl;

import com.cloud.dao.UserDao;
import com.cloud.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/21
 * @Time 6:33
 */
public class UserServiceImpl implements UserService, ApplicationContextAware, BeanFactoryAware, BeanNameAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware " + applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware " + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware " + name);
    }
}
