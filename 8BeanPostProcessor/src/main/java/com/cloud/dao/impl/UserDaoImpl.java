package com.cloud.dao.impl;

import com.cloud.dao.UserDao;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/20
 * @Time 14:59
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void show() {
        System.out.println("show...");
    }
}
