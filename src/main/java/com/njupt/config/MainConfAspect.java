package com.njupt.config;

import com.njupt.aop.LogAspect;
import com.njupt.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//面向切面编程：指在程序运行期间动态的将某段代码切入到指定方法指定位置执行。
@EnableAspectJAutoProxy//开启基于注解的aspect
@Configuration
public class MainConfAspect {
    //业务逻辑类
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }
    //切面类
    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
