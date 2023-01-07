package com.cloud.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 4:08
 */
@Configuration
@ComponentScan("com.cloud")
@EnableAspectJAutoProxy
public class SpringConfig {
}
