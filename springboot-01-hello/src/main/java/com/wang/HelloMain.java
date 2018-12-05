package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  来标注一个主程序类，说明是springboot应用
 */
@SpringBootApplication
public class HelloMain {
    public static void main(String[] args) {
        //spring应用启动
        SpringApplication.run(HelloMain.class,args);
    }
}
