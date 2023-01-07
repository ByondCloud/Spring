package com.cloud.handlers;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/23
 * @Time 19:26
 */
public class HaohaoBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        // 执行逻辑 注入一个BeanPostProcessor
        BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.cloud.processor.HaohaoBeanPostProcessor");
        parserContext.getRegistry().registerBeanDefinition("haohaoBeanPostProcessor", beanDefinition);
        return beanDefinition;
    }
}
