package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test.hello}")
    private String hi;

    @RequestMapping("/hello1")
    public String hello(){
        System.out.println("查到的值是"+hi);
        return  "hello";
    }
}
