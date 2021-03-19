package com.chen.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/10/03/10  11:19
 */
@Slf4j
@Controller
public class TestError {

    /**
     * 测试数学运算异常
     * @return 视图地址
     */
    @GetMapping("/testError")
    private String testError(){
        int a = 0;
        int b = 10;
        int c= b / a;
        System.out.println(c);
        return "redirect:main.html";
    }
}
