package com.cloud.controller;

import com.cloud.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/6
 * @Time 6:36
 */
@Controller
@RequestMapping("/quick")
public class QuickController {

    @Autowired
    private QuickService quickService;

    @RequestMapping(path="/show", method = RequestMethod.POST)
    public String show() {
        System.out.println("show方法" + quickService);
        return "/index.jsp";
    }

}
