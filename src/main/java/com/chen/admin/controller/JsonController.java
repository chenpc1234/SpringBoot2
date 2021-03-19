package com.chen.admin.controller;

import com.chen.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/4/03/04  10:25
 */
@Controller
public class JsonController {

    @GetMapping("/getInfo")
    @ResponseBody
    private User getUserInfo(){
       User user= new User();
       user.setUserName("chenPC");
       user.setUserPassword("chenPC");
        return user;
    }
}
