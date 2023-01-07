package com.cloud;

import com.cloud.config.SpringConfig;
import com.cloud.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 3:21
 */
public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) annotationConfigApplicationContext.getBean(UserService.class);
        userService.show();
    }
}
