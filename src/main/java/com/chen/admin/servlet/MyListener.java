package com.chen.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 自定义监听器 使用 @webListener注解
 * 一，监听servlet上下文对象生命周期的监听器
 * 实现ServletContextListener接口
 * 二，监听HttpSession对象的声明周期的监听器
 * 实现HttpSessionListener接口
 * 三，监听HttpServletRequest对象的声明周期
 * 实现ServletRequestListener接口
 * 四，监听ServletContext属性操作的监听器
 * 实现ServletContextAttributeListener接口
 * 五，监听HttpSession属性操作的监听器
 * 实现HttpSessionAttributeListener接口
 * 六，监听ServletRequest属性操作监听器
 * 实现ServletRequestAttributeListener接口
 * @author chenpc
 * @version 1.0
 * @since 2021/3/15/03/15  10:18
 */
@WebListener
@Slf4j
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("项目已启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("项目已停止");
    }
}
