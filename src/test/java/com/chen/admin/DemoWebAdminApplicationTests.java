package com.chen.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class DemoWebAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        System.out.println(dataSource.getClass());
/*
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from users");
        for (Map<String, Object> map : maps) {
            System.out.println(map.get("id"));
            System.out.println(map.get("username"));
        }*/
    }

}
