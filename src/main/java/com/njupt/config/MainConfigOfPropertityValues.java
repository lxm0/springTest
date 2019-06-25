package com.njupt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:spring/Animal.properties")
@Configuration
public class MainConfigOfPropertityValues {
    @Bean
    public Animal animal(){
        return new Animal();
    }
}
