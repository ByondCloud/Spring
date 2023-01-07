package com.cloud.handlers;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/23
 * @Time 19:11
 */
public class HaohaoNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        // 初始化
        // 一般情况下，一个命名空间下有多个标签
        // 会在init方法中为每一个标签注册一个标签解析器
        this.registerBeanDefinitionParser("annotation-driven", new HaohaoBeanDefinitionParser());

    }
}
