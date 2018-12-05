package com.wang.springboot06jap.repository;

import com.wang.springboot06jap.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//继承JpaRepository<实体类,主键类型>

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
