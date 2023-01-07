package com.cloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.cloud.anno.MyMapperScan;
import com.cloud.imports.MyImportBeanDefinitionRegistrar;
import com.cloud.imports.MyImportSelector;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 2:44
 */
@Configuration
@ComponentScan("com.cloud")
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
@MyMapperScan
public class SpringConfig {




}
