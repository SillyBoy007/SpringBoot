package com.wang.spingboot06mybatis.controller;

import com.wang.spingboot06mybatis.entity.Department;
import com.wang.spingboot06mybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;


    @GetMapping("/dept/{id}")
    @ResponseBody
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }
}
