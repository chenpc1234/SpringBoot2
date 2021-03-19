package com.chen.admin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * 使用配置类的方式 注入druid数据源相关组件
 * @author chenpc
 * @version 1.0
 * @since 2021/3/17/03/17  17:31
 */
@Deprecated
/**
 *@Configuration
 */
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setFilters("wall,stat");
        return  druidDataSource;
    }

    @Bean
    public ServletRegistrationBean myServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        return new ServletRegistrationBean(statViewServlet,"/druid/*");
    }

/*    @Bean
    public FilterRegistrationBean myFilter(){
        StatFilter statFilter = new StatFilter();
        statFilter.setLogSlowSql(true);
        statFilter.setSlowSqlMillis(1000);
        FilterRegistrationBean statFilters = new FilterRegistrationBean<StatFilter>(statFilter);

        return statFilterFilterRegistrationBean;

    }*/
    @Bean
    public FilterRegistrationBean webFilter(){
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
