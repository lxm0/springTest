package com.njupt.config;

import com.njupt.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.njupt")
public class ManConfigLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return  new Car();
    }
}
