package com.cloud.service.impl;

import com.cloud.dao.Dao;
import com.cloud.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/28
 * @Time 14:20
 */
@Component("service")
public class ServiceImpl implements Service {

     // 根据类型注入
    private Dao dao;

    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public void show() {
        System.out.println(dao);
    }
}
