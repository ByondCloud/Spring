package com.cloud.advice;

import org.springframework.stereotype.Component;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 23:01
 */
// 增强类，提供增强方法
@Component("myAdvice")
public class MyAdvice {

    public void beforeAdvice() {
        System.out.println("前置增强");
    }

    public void afterAdvice() {
        System.out.println("后置增强");
    }
}
