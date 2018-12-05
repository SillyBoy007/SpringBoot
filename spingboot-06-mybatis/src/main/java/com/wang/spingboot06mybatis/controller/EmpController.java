package com.wang.spingboot06mybatis.controller;

import com.wang.spingboot06mybatis.entity.Employee;
import com.wang.spingboot06mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/emp/{id}")
    @ResponseBody
    public Employee getDepartment(@PathVariable("id") Integer id){
        return employeeMapper.getEmployeeById(id);
    }
}
