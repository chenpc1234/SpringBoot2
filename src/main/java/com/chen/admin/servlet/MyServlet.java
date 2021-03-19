package com.chen.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义Servlet  SpringBoot注入原生Servlet
 * 使用WebServlet注解 + @ServletComponentScan 在启动类中
 * @author chenpc
 * @version 1.0
 * @since 2021/3/15/03/15  09:31
 */
@WebServlet(urlPatterns = "/myServlet")
@Slf4j
public class MyServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("/myServlet doGet执行");
        resp.getWriter().write("88888");
    }
}
