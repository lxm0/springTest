package com.njupt.bean;

import com.njupt.SimpleIOC.FactoryBeanTest;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanLearn implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new FactoryBeanTest();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanTest.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
