package com.wang.learn.springboot02config.config;

import com.wang.learn.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一个配置类
 */

@Configuration
public class MyAppConfig {
    //将方法的返回值添加到组件中
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
