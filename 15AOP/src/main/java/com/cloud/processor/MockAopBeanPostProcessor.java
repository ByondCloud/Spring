package com.cloud.processor;

import com.cloud.advice.MyAdvice;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 23:03
 */
@Component
public class MockAopBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 对UserServiceImpl中的show1和show2方法进行增强，增强方法在MyAdvice中
        // 首先需要判断类是否为UserServiceImpl
        // 从Spring容器中获取MyAdvice
        if (bean.getClass().getPackage().getName().equals("com.cloud.service.impl")) {
            // 生成当前Bean的Proxy对象
            Object beanProxy = Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        MyAdvice myAdvice = applicationContext.getBean(MyAdvice.class);
                        // 执行增强对象的before方法
                        myAdvice.beforeAdvice();

                        // 执行目标方法
                        Object invoke = method.invoke(bean, args);

                        // 执行增强对象的after方法
                        myAdvice.afterAdvice();
                        return invoke;
                    }
            );
            return beanProxy;
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
