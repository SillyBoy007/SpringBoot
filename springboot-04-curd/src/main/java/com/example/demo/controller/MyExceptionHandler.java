package com.example.demo.controller;

import com.example.demo.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 捕获异常
 */
@ControllerAdvice
public class MyExceptionHandler {

   /* *//**
     * 无论是浏览器还是客户端都返回json
     * @param e
     * @return
     *//*
    @ResponseBody
    @ExceptionHandler
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("message","user not exist");
        map.put("code",-1);
        return map;
    }*/

    /**
     * 转发自适应
     * @param e
     * @return
     */
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest httpServletRequest){
        Map<String,Object> map = new HashMap<>();
        //传入自身的状态码
        map.put("message",e.getMessage());
        map.put("code",-1);
        httpServletRequest.setAttribute("javax.servlet.error.status_code",500);
        httpServletRequest.setAttribute("ext",map);
        return "forward:/error";
    }


}
