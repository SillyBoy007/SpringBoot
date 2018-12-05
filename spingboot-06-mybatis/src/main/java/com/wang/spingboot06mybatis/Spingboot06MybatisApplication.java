package com.wang.spingboot06mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.wang.spingboot06mybatis.mapper")
@SpringBootApplication
public class Spingboot06MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spingboot06MybatisApplication.class, args);
    }
}
