package com.wang.springboot06jap.controller;

import com.wang.springboot06jap.entity.User;
import com.wang.springboot06jap.repository.UserRepository;
import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findById(id).get();
       // System.out.println(userRepository.getOne(id));

        //
        return user;
    }
}
