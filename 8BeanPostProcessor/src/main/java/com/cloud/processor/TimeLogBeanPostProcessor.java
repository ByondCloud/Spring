package com.cloud.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/20
 * @Time 16:24
 */
public class TimeLogBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        Object beanProxy = Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    // 输出开始时间
                    System.out.println(method.getName() + "开始时间:" + new Date());
                    // 执行目标方法
                    Object result = method.invoke(bean, args);
                    // 输出结束时间
                    System.out.println(method.getName() + "开始时间:" + new Date());
                    return result;
                }
        );

        return beanProxy;
    }
}
