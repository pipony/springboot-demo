package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
    测试User类的控制类，配合mybatisplus进行数据库操作
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper; // 声明mapper类

    @GetMapping(value = "/user/{id}")
    public String queryUser (@PathVariable String id) {
        User user = userMapper.selectById(id);
        return user.toString();
    }

    @PostMapping(value = "/user")
    public String insertUser(User user) {
        int row = userMapper.insert(user);
        if (row > 0) {
            return "insert success!";
        } else {
            return "insert fail!";
        }
    }

    @PutMapping(value = "/user")
    public String updateUser (User user) {
        int row =  userMapper.updateById(user);
        if (row > 0) {
            return "update success!";
        } else {
            return "update fail!";
        }
    }

    @DeleteMapping(value = "/user/{id}")
    public String deleteUser (@PathVariable String id) {
        int row = userMapper.deleteById(id);
        if (row > 0) {
            return "delete success!";
        } else {
            return "delete fail!";
        }
    }





}
