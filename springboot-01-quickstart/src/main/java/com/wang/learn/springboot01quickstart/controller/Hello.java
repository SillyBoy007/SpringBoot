package com.wang.learn.springboot01quickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody  //这个类所有方法数据直接写给浏览器
public class Hello {
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
