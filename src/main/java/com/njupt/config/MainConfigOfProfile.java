package com.njupt.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
@PropertySource("classpath:/jdbc.properties")
@Configuration
public class MainConfigOfProfile {

    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.passwd}")
    private String passwd;
    @Value("${jdbc.driverClass}")
    private String driverClass;
    @Value("${jdbc.jdbcUrl}")
    private String jdbcUrl;

    @Profile("test")//根据环境来注册bean
    @Bean("TestDataSource")
    public DataSource dataSourceTest(@Value("${jdbc.passwd}") String pwd)throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Profile("dev")
    @Bean("DevDataSource")
    public DataSource dataSourceDev(@Value("${jdbc.passwd}") String pwd)throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setJdbcUrl("jdbc:mysql://localhost://3306/student");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Profile("prod")
    @Bean("ProdDevDataSource")
    public DataSource dataSourceProd(@Value("${jdbc.passwd}") String pwd)throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setJdbcUrl("jdbc:mysql://localhost://3306/ssm");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

}
