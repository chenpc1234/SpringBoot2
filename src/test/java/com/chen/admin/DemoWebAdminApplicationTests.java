package com.chen.admin;

import com.chen.admin.bean.User;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class DemoWebAdminApplicationTests {

    public static void main(String[] args) {
        User u =new User();
        String s = ClassLayout.parseInstance(u).toPrintable().toString();
        System.out.println(s);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

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
    @Test
    void redis(){
//        Object name = redisTemplate.opsForValue().get("name");
//        Object chen = redisTemplate.opsForValue().get("chen");
//        System.out.println(name);
//
//        System.out.println(chen);
       // stringRedisTemplate.opsForValue().set("aaaa", "aaaa");

      //  String name = stringRedisTemplate.opsForValue().get("name");
     //   System.out.println(name);


    }

}
