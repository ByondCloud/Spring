package com.cloud.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/29
 * @Time 22:52
 */
@Configuration // 标注当前类是一个配置类（替代xml文件）
@Import(abc.class)
public class SpringConfig {

}
