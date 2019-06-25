package com.njupt.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;
@Component
public class Red implements ApplicationContextAware ,BeanNameAware,EmbeddedValueResolverAware{

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("穿入的IOC"+applicationContext);

    }


    public void setBeanName(String s) {
        System.out.println("当前Bean的名字"+s);

    }


    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        String s  =stringValueResolver.resolveStringValue("你好${os.name}");
        System.out.println("解析的字符串"+s);
    }
}
