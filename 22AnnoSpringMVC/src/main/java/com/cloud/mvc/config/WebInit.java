package com.cloud.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/7
 * @Time 12:47
 */
// web工程的初始化类，用来代替web.xml
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 指定Spring的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    // 指定SpringMVC的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    // 设置前端控制器的映射规则，就是url-pattern
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
