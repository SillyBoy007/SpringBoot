package com.wang.spingboot06mybatis.mapper;

import com.wang.spingboot06mybatis.entity.Employee;

//1.将接口扫描到容器中
public interface EmployeeMapper {

    Employee getEmployeeById(Integer id);
    void insertEmployee(Employee employee);
}
