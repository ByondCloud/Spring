package com.cloud.mapper;

import com.cloud.pojo.User;

import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 2:57
 */
public interface UserMapper {
    List<User> findAll();
}
