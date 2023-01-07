package com.cloud.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/1
 * @Time 7:14
 */
public class MyAdvice3 implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("环绕前");

        Object invoke = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());

        System.out.println("环绕后");

        return invoke;
    }
}
