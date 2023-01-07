package com.cloud.mapper;

import com.cloud.pojo.User;

import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/21
 * @Time 15:16
 */
public interface UserMapper {
    List<User> findAll();
}
