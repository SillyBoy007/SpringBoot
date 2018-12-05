package com.wang.learn.springboot02config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:beans.xml"})  //导入spring的配置文件让其生效
@SpringBootApplication
public class Springboot02ConfigApplication {


    public static void main(String[] args) {
        SpringApplication.run(Springboot02ConfigApplication.class, args);
    }
}
