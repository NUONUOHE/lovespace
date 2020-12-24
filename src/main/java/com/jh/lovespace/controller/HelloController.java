package com.jh.lovespace.controller;

import com.jh.lovespace.dal.entity.User;
import com.jh.lovespace.dal.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjuchao
 * @create 2020/8/31
 */
@RestController
@RequestMapping("/")
@Slf4j
public class HelloController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/hello")
    public String hello(){
        log.info("我是info");
        log.error("我是error");
        return "hello world!";
    }

    @GetMapping("/test")
    public User test(){
        User user = userMapper.selectByPrimaryKey(1);
        return user;
    }
}
