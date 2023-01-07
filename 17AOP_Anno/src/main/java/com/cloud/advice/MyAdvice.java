package com.cloud.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 2:35
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.cloud.dao.impl.UserDaoImpl.show())")
    public void myPointcut() {

    }

    @Before("myPointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("目标对象是：" + joinPoint.getTarget());
        System.out.println("表达式：" + joinPoint.getStaticPart());
        System.out.println("前置增强");
    }
    public void afterReturningAdvice() {
        System.out.println("后置增强");
    }

}
