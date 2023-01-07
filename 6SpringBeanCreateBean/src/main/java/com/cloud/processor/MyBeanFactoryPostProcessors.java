package com.cloud.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/18
 * @Time 13:35
 */
public class MyBeanFactoryPostProcessors implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("beanDefinitionMap填充完毕后，回调该方法");
//        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("service");
//        beanDefinition.setBeanClassName("com.cloud.dao.impl.UserDaoImpl");
//        BeanDefinition beanDefinition = new RootBeanDefinition();
//        beanDefinition.setBeanClassName("com.cloud.dao.impl.PersonDaoImpl");
//        // 强转成DefaultListableBeanFactory
//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
//        defaultListableBeanFactory.registerBeanDefinition("personDao", beanDefinition);




    }
}
