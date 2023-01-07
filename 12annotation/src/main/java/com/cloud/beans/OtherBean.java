package com.cloud.beans;

import com.alibaba.druid.pool.DruidDataSource;
import com.cloud.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/29
 * @Time 21:34
 */
@Component
public class OtherBean {
    @Bean("dataSource")
    public DataSource dataSource(@Value("${jdbc.driver}") String driverClassName,
                                 Dao dao) {

//        System.out.println(driverClassName);
//        System.out.println(dao);

        DruidDataSource druidDataSource = new DruidDataSource();

        return druidDataSource;
    }
}
