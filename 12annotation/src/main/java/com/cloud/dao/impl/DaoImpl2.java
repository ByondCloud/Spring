package com.cloud.dao.impl;

import com.cloud.dao.Dao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/29
 * @Time 23:59
 */
@Component("dao2")
@Primary
public class DaoImpl2 implements Dao {
    @Override
    public void show() {
        System.out.println("hhh");
    }
}
