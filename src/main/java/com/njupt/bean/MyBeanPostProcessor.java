package com.njupt.bean;

import com.njupt.config.Animal;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
//将后置处理器加入spring中
@Component
public class MyBeanPostProcessor implements BeanPostProcessor,Ordered {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+"-->"+s+"-->"+o);
        if(o instanceof Animal){
            ((Animal) o).setName("lxm");
        }
        System.out.println("postProcessBeforeInitialization"+"-->"+s+"-->"+o);

        return o;
    }


    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+"-->"+s+"-->"+o);
        return o;
    }

    public int getOrder() {
        return 10;
    }
}
