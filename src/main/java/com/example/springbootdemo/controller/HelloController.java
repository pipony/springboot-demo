package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;

/*
    简单测试http请求是否正常响应
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String index() {
        return "hello world";
    }

    @RequestMapping(value = "/hello/post1", method = RequestMethod.POST)
    public String fun1() {
        return "hello post1!";
    }

    @RequestMapping(value = "/hello/post2", method = RequestMethod.POST)
    public String fun2(@RequestBody String nickname) { // 加上RequestBody才能传入json格式的数据
        return "hello post2! Your name is "+nickname;
    }

    @RequestMapping(value = "/hello/post3", method = RequestMethod.POST)
    public String fun3(@RequestParam("nickname") String name) { // RequestParam可实现字段名映射（否则需要传入和接收的字段名一致）
        return "hello post3! Your name is "+name;
    }

}
