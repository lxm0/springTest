package com.njupt.activemq.spring;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author Li
 * @version 1.0
 * @date 2019/6/25 16:24
 */
@Component
public class MyMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        if(null!= message && message instanceof TextMessage){
            TextMessage textMessage = (TextMessage)message;
            try {
                System.out.println("MyMessageListener "+textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
