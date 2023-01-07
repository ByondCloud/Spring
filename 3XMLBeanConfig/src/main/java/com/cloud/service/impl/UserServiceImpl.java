package com.cloud.service.impl;

import com.cloud.dao.UserDao;
import com.cloud.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/12
 * @Time 16:46
 */
public class UserServiceImpl implements UserService {

    private List<String> stringList;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }


    private List<UserDao> UserDaoList;

    public void setUserDaoList(List<UserDao> userDaoList) {
        UserDaoList = userDaoList;
    }

    private Set<String> strSet;

    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }

    private Set<UserDao> userDaoSet;

    public void setUserDaoSet(Set<UserDao> userDaoSet) {
        this.userDaoSet = userDaoSet;
    }


    private Map<String, UserDao> map;

    public void setMap(Map<String, UserDao> map) {
        this.map = map;
    }

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void show() {
        System.out.println(stringList);
        System.out.println(UserDaoList);
        System.out.println(strSet);
        System.out.println(userDaoSet);
        System.out.println(map);
        System.out.println(properties);
    }
}
