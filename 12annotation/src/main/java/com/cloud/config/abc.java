package com.cloud.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/29
 * @Time 23:50
 */
@Configuration
@ComponentScan("com.cloud")
@PropertySource("classpath:jdbc.properties")
public class abc {
}
