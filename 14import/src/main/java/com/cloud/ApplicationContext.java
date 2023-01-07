package com.cloud;

import com.cloud.beans.OtherBean2;
import com.cloud.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 5:39
 */
public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        OtherBean2 bean = annotationConfigApplicationContext.getBean(OtherBean2.class);
        System.out.println(bean);
    }
}
