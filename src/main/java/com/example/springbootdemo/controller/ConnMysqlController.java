package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
    用于测试数据库连接是否成功
 */

@RestController
public class ConnMysqlController {

    @Autowired
    DataSource dataSource;

    @GetMapping(value = "/conn")
    public String testConn() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        connection.close();
        return "连接数据库结束";

    }
}
