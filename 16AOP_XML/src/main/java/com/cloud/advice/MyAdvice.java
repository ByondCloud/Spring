package com.cloud.advice;

import org.aspectj.lang.ProceedingJoinPoint;
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

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("环绕前通知");

        // 代表执行目标方法，由于目标方法可能会有返回值，因此这里就不用void，改成Object
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("环绕后通知");

        return proceed;
    }

}
