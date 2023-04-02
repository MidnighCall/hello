package com.kojikoji.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author kojikoji 1310402980@qq.com
 * @Date 2023/4/2 20:37
 * @Version
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello(){
        System.out.println("Hello World");
        return "OK";
    }
}
