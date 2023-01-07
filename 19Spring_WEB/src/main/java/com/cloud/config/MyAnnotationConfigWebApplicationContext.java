package com.cloud.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/5
 * @Time 19:35
 */
public class MyAnnotationConfigWebApplicationContext extends AnnotationConfigWebApplicationContext {

    public MyAnnotationConfigWebApplicationContext() {
        super();
        this.register(SpringConfig.class);
    }

}
