package com.cloud;

import com.cloud.config.SpringConfig;
import com.cloud.dao.Dao;
import com.cloud.dao.impl.DaoImpl;
import com.cloud.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/28
 * @Time 14:21
 */
public class ApplicationContextTest {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "test");

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Object dao = annotationConfigApplicationContext.getBean("dao");
        System.out.println(dao);

    }
}
