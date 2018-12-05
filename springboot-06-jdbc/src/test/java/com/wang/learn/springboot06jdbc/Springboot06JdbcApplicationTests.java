package com.wang.learn.springboot06jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06JdbcApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    public void contextLoads() throws SQLException {
        //默认:com.zaxxer.hikari.HikariDataSource
        System.out.println("dataSource======================"+dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("dataSource======================"+connection);



        connection.close();

    }

}
