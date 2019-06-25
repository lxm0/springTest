package com.njupt.config;

import com.njupt.bean.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MianConfBeanPostProcessor {
    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }
    @Bean
    public Animal animal(){
        return  new Animal();
    }
}
