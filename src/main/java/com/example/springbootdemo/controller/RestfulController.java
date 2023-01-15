package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestfulController {

    // 初步测试Restful风格的API（先跳过具体实现）
    /*
    格式：根据http method指定操作
    1、post 创建 /user
    2、get 获取 /user/id
    3、put 更新 /user
    4、delete 删除 /user/id
     */


    @PostMapping(value = "/restful")
    public String insert (User user) {
        return "insert user.id="+user.getId();
    }

    @GetMapping(value = "/restful/{id}")
    // 路径的id别忘了加{}
    public String query (@PathVariable int id) {
        return "query id="+id;
    }

    @PutMapping(value = "/restful")
    public String update (User user) {
        System.out.println(user);
        return "update name="+user.getName();
    }

    @DeleteMapping(value = "/restful/{id}")
    public String delete (@PathVariable int id) {
        return "delete id="+id;
    }
}
