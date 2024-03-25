package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Value("${test.hello}")
    private String hi;
    @Autowired
    private TestService testService;

    @RequestMapping("/hello1")
    public String hello(){
        System.out.println("查到的值是"+hi);
        return  "hello";
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
