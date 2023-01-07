package com.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/6
 * @Time 20:23
 */
@RestController
public class TestController {


    @RequestMapping("/testInterceptor")
    public void testInterceptor() {
        System.out.println("controller方法");
    }

}
