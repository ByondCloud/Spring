package com.cloud.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/5
 * @Time 8:27
 */
public class ContextLoaderListener implements ServletContextListener {

    private String CONTEXT_CONFIG_LOCATION = "contextConfigLocation";

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("ContextLoadListener init...");

        ServletContext servletContext = sce.getServletContext();
        // 获取contextConfigLocation配置文件的名称
        String contextConfigLocation = servletContext.getInitParameter(CONTEXT_CONFIG_LOCATION);
        // 解析出配置文件的名称
        contextConfigLocation = contextConfigLocation.substring("classpath:".length());
        // 1. 创建Spring容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfigLocation);

        // 2. 将容器存储到servletContext域中
        servletContext.setAttribute("applicationContext", applicationContext);
    }
}
