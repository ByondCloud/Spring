package com.cloud.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/6
 * @Time 20:28
 */
@Component
public class FirstInterceptor implements HandlerInterceptor {

    // 控制器方法执行之前
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        System.out.println("前置拦截");
        return true;
    }

    // 控制器方法执行之后
    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("后置拦截");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    // 视图渲染之后
    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
