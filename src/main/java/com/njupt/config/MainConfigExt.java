package com.njupt.config;

import com.njupt.bean.Car;
import com.njupt.bean.CustomBeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.njupt.bean")
public class MainConfigExt {
    @Bean
    public CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor(){
        return new CustomBeanFactoryPostProcessor();
    }
    @Bean("car")
    public Car car(){
        return new Car();
    }
}
