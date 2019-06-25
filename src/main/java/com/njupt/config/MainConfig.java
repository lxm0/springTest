package com.njupt.config;

import com.njupt.conditional.linuxConditional;
import com.njupt.conditional.windowsConditional;
import org.springframework.context.annotation.*;

import java.util.Properties;

@Configuration
@ComponentScan(value = "com.njupt")

public class MainConfig {
    //默认单实例,ioc容器启动会创建到ioc容器中
    //prototype:多实例是从获取bean开始创建对象到IOC容器。
    @Scope("prototype")
    @Lazy
    @Bean(value = "animal")
    public Animal animal(){
        System.out.println("给容器创建animal");
        return new Animal("li");
    }
    @Conditional(windowsConditional.class)
    @Bean( "bill")
    public Animal animal01(){
        //System.out.println("给容器创建animal");
        return new Animal("bill");
    }
    @Conditional(linuxConditional.class)
    @Bean("linus")
    public Animal animal02(){
       // System.out.println("给容器创建animal");
        return new Animal("linus");
    }
    @Bean
    public Properties properties(){
        Properties properties = new Properties();
        properties.setProperty("1","dd");
        return properties;
    }

}
