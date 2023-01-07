package com.cloud.processor;

import com.cloud.utils.BaseClassScanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.util.Map;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/20
 * @Time 14:06
 */
public class MyComponentBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // 通过扫描工具去扫描包及其子包下的所有包
        Map<String, Class> stringClassMap = BaseClassScanUtils.scanMyComponentAnnotation("com.cloud");
        stringClassMap.forEach((beanName, clazz) -> {
            String name = clazz.getName();
            BeanDefinition beanDefinition = new RootBeanDefinition();
            beanDefinition.setBeanClassName(name);

            registry.registerBeanDefinition(beanName, beanDefinition);
        });

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
