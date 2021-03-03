package com.jh.lovespace;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jh.lovespace.dal")
public class LovespaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovespaceApplication.class, args);
    }

}
