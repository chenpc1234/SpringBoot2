package com.chen.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 自定义Filter过滤器 使用 @WebFilter 注解
 * @author chenpc
 * @version 1.0
 * @since 2021/3/15/03/15  10:07
 */
@WebFilter(urlPatterns={"/myServlet","/css/*","/images/*"})
@Slf4j
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("Filter初始化完成");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doFilter方法执行");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("Filter销毁");
    }
}
