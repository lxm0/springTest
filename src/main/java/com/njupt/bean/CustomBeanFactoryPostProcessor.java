package com.njupt.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("调用了自定义的BeanFactoryPostProcessor " + configurableListableBeanFactory);
        Iterator it = configurableListableBeanFactory.getBeanNamesIterator();

        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        // 获取了所有的bean名称列表
        for(int i=0; i<names.length; i++){
            String name = names[i];

            BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition(name);
            System.out.println(name + " bean properties: " + bd.getPropertyValues().toString());
            // 本内容只是个demo，打印持有的bean的属性情况
        }
    }
}
