package com.wang.learn.springboot02config;

import com.wang.learn.springboot02config.bean.Person;
import com.wang.learn.springboot02config.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *  Springboot单元测试
 *  可以在测试期间方便地进行自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHello(){
        boolean helloService = ioc.containsBean("helloService");

        System.out.println("====================");
        System.out.println(helloService);
    }
    @Test
    public void contextLoads() {
        System.out.println(person);
    }
}
