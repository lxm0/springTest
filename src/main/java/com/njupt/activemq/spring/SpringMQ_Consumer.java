package com.njupt.activemq.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Li
 * @version 1.0
 * @date 2019/6/25 16:08
 */
@Service
public class SpringMQ_Consumer {
    @Autowired
    private JmsTemplate jmsTemplate;
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationcontext-activeMQ.xml");
        SpringMQ_Consumer consumer = (SpringMQ_Consumer)applicationContext.getBean("springMQ_Consumer");
        String value = (String) consumer.jmsTemplate.receiveAndConvert();

        System.out.println("收到的消息 "+value);
    }
}
