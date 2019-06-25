package com.njupt.activemq.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author Li
 * @version 1.0
 * @date 2019/6/25 15:52
 */
@Service
public class SpringMQ_Produce {
    @Autowired
    private JmsTemplate jmsTemplate;
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationcontext-activeMQ.xml");
        SpringMQ_Produce produce = (SpringMQ_Produce) applicationContext.getBean("springMQ_Produce");
        produce.jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage("**spring和activeMQ整合");
                return message;
            }
        });
        System.out.println("*****send task over");
    }
}
