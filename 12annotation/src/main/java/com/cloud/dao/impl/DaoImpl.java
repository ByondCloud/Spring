package com.cloud.dao.impl;

import com.cloud.dao.Dao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/28
 * @Time 14:20
 */

@Component("dao")
@Profile("test")
public class DaoImpl implements Dao {


    public void show() {
    }

}
