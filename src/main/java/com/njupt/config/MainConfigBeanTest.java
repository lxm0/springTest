package com.njupt.config;

import com.njupt.bean.Dependency;
import com.njupt.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MainConfigBeanTest {
    @Scope("prototype")
    @Bean
    public Dependency dependency(){
        Dependency dependency = new Dependency();
        int[] array = {1,2};
        List list = new ArrayList();
        list.add(3);
        dependency.setList(list);
        dependency.setArray(array);
        return dependency;
    }

    @Bean
    public Dependency dependency1(){
        Dependency dependency = new Dependency();
        int[] array = {1,2};
        List list = new ArrayList();
        list.add(2);
        dependency.setList(list);
        dependency.setArray(array);
        return dependency;
    }
    @Bean
    public Animal animal(){
        return new Animal();
    }
    @Bean
    public Person person(){
        return new Person();
    }
}
