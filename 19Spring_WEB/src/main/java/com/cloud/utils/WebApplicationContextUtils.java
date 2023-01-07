package com.cloud.utils;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/5
 * @Time 12:22
 */
public class WebApplicationContextUtils {

    public static ApplicationContext getWebApplicationContext(ServletContext servletContext) {
        return (ApplicationContext) servletContext.getAttribute("applicationContext");
    }

}
