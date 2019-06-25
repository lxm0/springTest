package com.njupt.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class JmsConsumer_Sub {
    public static final String ACTIVEMQ_URL = "tcp://192.168.40.133:61616";
    public static final String TOPIC_NAME = "topic_Persist";

    public static void main(String[] args) throws JMSException, IOException {
        System.out.println("我是li4消费者");
//        1.创建连接工厂
        ActiveMQConnectionFactory factory =
                new ActiveMQConnectionFactory(ACTIVEMQ_URL);

        //2.通过连接工厂，获得connection并启动，采用默认用户名和密码
        Connection connection = factory.createConnection();
        connection.setClientID("li4");

        //3.创建Session,两个参数，事物；签收
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);

        //4.创建目的地
        Topic topic = session.createTopic(TOPIC_NAME);
        //持久化订阅者
        TopicSubscriber subscriber = session.createDurableSubscriber(topic,"remark...");

        connection.start();
        Message message =subscriber.receive();
        while(null!=message){
            TextMessage textMessage =(TextMessage)message;
            System.out.println("收到的持久化消息"+textMessage.getText());
            message = subscriber.receive(1000L);
        }


        subscriber.close();
        session.commit();//消费者不commit，会重复消费消息
        session.close();
        connection.close();
    }
}
