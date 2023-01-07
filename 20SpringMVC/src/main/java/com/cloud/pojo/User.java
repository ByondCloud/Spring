package com.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/6
 * @Time 12:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private Integer age;
    private String[] hobbies;
    private Date birthday;
    private Address address;

}
