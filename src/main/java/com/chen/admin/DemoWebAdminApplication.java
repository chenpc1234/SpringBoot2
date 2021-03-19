package com.chen.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot2 应用启动类
 * ServletComponentScan 服务组件扫描，扫描指定路径下的组件@webServlet @webFilter @webListener等
 * //@ServletComponentScan(basePackages = "com.chen.admin.servlet")
 * @author 陈鹏程
 */
@SpringBootApplication
@MapperScan("com.chen.admin.mapper")
public class DemoWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebAdminApplication.class, args);
    }

}
