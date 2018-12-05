package com.wang.spingboot06mybatis.mapper;

import com.wang.spingboot06mybatis.entity.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper
/*@Mapper*/  //必须注解，可以在启动类中加@MapperScan扫描所有Mapper类
public interface DepartmentMapper {
    @Select("select * from department_name where id=#{id}")
     Department getDeptById(Integer id);

    @Delete("delete from department_name where id=#{id}")
     int deleteDeptById(Integer id);

    //主键自增
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department_name values(#{departmentName})")
     int insertDept(Department department);

    @Update("update department_name set departmentName=#{departmentName} where id=#{id}")
     int updateDept(Department department);
}
