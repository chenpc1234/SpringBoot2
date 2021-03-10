package com.chenpc.admin.controller;

import com.chenpc.admin.Bean.User;
import com.chenpc.admin.Dao.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/2/20/02/20  16:49
 */
@Controller
public class IndexController {

    @GetMapping({"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        System.out.println(user.getUserName());
        System.out.println(user.getUserPassword());
        if (UserUtils.isExist(user)){
            session.setAttribute("user", user);
            return "redirect:main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }
    @GetMapping("/main.html")
    public String mainPage(
    //        HttpSession session, Model model
    ){
        return "main";
        /*if (session.getAttribute("user")!=null){
            return "main";
        }else {
            model.addAttribute("msg","请重新登陆");
            return "login";
        }*/
    }

}
