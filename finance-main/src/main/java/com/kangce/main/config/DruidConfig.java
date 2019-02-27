package com.kangce.main.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用application.yml里面配置 Druid的特殊属性
 */
@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParames=new HashMap<>();
        initParames.put("loginUsername","admin");
        initParames.put("loginPassword","123456");
        initParames.put("allow","");
        initParames.put("deny","");
        bean.setInitParameters(initParames);
        return bean;
    }
//    监控网页可以通过此查看    http://localhost:8080/druid/sql.html
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParames=new HashMap<>();
        initParames.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParames);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
