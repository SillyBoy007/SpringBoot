package com.wang.learn.springboot02config02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02Config02ApplicationTests {
    @Value("${person}")
    private String person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
