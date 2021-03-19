package com.chen.admin.config;

import com.chen.admin.servlet.MyListener;
import com.chen.admin.servlet.MyFilter;
import com.chen.admin.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * 添加配置 原生Servlet  filter listener
 * 使用@Configuration(proxyBeanMethods = true)
 * @author chenpc
 * @version 1.0
 * @since 2021/3/15/03/15  14:12
 */
@Deprecated
//@Configuration(proxyBeanMethods = true)
public class MyRegisterConfig {

    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet = new MyServlet();

        return new ServletRegistrationBean(myServlet,"/myServlet");
    }
    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter = new MyFilter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet","/css/*","/images/*"));
        //return new FilterRegistrationBean(myFilter,myServlet());
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyListener myListener = new MyListener();
        return new ServletListenerRegistrationBean(myListener);
    }

}
