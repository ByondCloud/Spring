package com.cloud.controller;

import com.cloud.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;


/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/6
 * @Time 11:02
 */
@Controller
public class ParamController {

    @GetMapping("/param")
    public void param(@RequestParam(value = "username", defaultValue = "cloud") String username, Integer age) {
        System.out.println(username);
        System.out.println(age);
    }

    @GetMapping("/param1")
    public void param1(User user) {
        System.out.println(user);
    }

    @PostMapping("/param2")
    public void param2(@RequestBody User user) {

        System.out.println(user);
    }

    @GetMapping ("/user/{id}/{xxx}")
    public void param3(@PathVariable("id") int id,
                       @PathVariable("xxx") int username) {
        System.out.println(id);
        System.out.println(username);
    }

    @PostMapping("/param4")
    public void param4(@RequestBody MultipartFile file) throws IOException {
        // 1. 获得上传文件的输入流
        InputStream inputStream = file.getInputStream();
        // 2. 搞一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\" + file.getOriginalFilename());
        // 3. copy
        IOUtils.copy(inputStream, fileOutputStream);
        // 4. 关闭
        inputStream.close();
        fileOutputStream.close();
    }

    @GetMapping("/param5")
    public void param5(@RequestHeader("Accept-Encoding") String headerValue) {
        System.out.println(headerValue);
    }

    @GetMapping("/param6")
    public void param6(@RequestHeader Map<String, String> map) {
        map.forEach((k, v) -> {
            System.out.println(k + "-" + v);
        });
    }

    @GetMapping("/param7")
    public void param7(@CookieValue("JSESSIONID") String jessionid) {
        System.out.println(jessionid);
    }

    @GetMapping("/request1")
    public String request1(HttpServletRequest request) {
        request.setAttribute("name", "cloud");
        return "/request2";
    }

    @GetMapping("/request2")
    public String request2(@RequestAttribute("name") String name) {
        System.out.println(name);
        return "index.jsp";
    }

}
