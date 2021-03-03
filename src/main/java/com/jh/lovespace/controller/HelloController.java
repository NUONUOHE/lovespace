package com.jh.lovespace.controller;

import com.jh.lovespace.dal.entity.UserInfo;
import com.jh.lovespace.dal.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author jiangjuchao
 * @create 2020/8/31
 */
@RestController
@RequestMapping("/")
@Slf4j
public class HelloController {
    @Autowired
    UserInfoMapper userInfoMapper;
    @GetMapping("/hello")
    public String hello(){
        log.info("我是info");
        log.error("我是error");
        return "hello world!";
    }

    @GetMapping("/test")
    public UserInfo test(){
        UserInfo build = UserInfo.builder().userName("nana").userPassword("11").userPhone("22").userEmail("e").createTime(new Date()).modifyTime(new Date()).build();
        userInfoMapper.insert(build);
        UserInfo user = userInfoMapper.selectByPrimaryKey(1);
        return user;
    }
}
