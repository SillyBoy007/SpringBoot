package com.wang.springboot06jap.entity;

import javax.persistence.*;

//使用JPA注解配置映射关系
@Entity
@Table(name = "tbl_user") //配置表名，若省略则默认表名是user
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;
    @Column(name = "lastName",length = 20)  //若省略就是属性名
    private String username;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
