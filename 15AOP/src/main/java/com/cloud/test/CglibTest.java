package com.cloud.test;

import com.cloud.service.impl.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/3
 * @Time 4:22
 */
public class CglibTest {
    public static void main(String[] args) {


        // 目标对象
        Target target = new Target();

        // 通知对象
        MyAdvice2 myAdvice2 = new MyAdvice2();

        // 编写Cglib代码
        Enhancer enhancer = new Enhancer();

        // 设置父类
        enhancer.setSuperclass(Target.class); // 生成的代理对象就是Target的子类

        // 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            // 相当于JDK的invoke方法
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAdvice2.before();
                Object invoke = method.invoke(target, objects); // 执行目标方法
                myAdvice2.after();
                return invoke;
            }
        });


        // 生成代理对象
        Target proxy = (Target) enhancer.create();

        // 测试
        proxy.show();




    }
}
