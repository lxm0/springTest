package com.njupt.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class JmsConsumer_Topic {
    public static final String ACTIVEMQ_URL = "tcp://192.168.40.133:61616";
    public static final String TOPIC_NAME = "topic01";

    public static void main(String[] args) throws JMSException, IOException {
        System.out.println("我是3号消费者");
//        1.创建连接工厂
        ActiveMQConnectionFactory factory =
                new ActiveMQConnectionFactory(ACTIVEMQ_URL);

        //2.通过连接工厂，获得connection并启动
        Connection connection = factory.createConnection();
        connection.setClientID("li4");
        connection.start();
        //3.创建Session,两个参数，事物；签收
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

//            Destination destination = session.createQueue(QUEUE_NAME);
        //4.创建目的地
        Topic topic = session.createTopic(TOPIC_NAME);


        //5.创建消费者
        MessageConsumer consumer = session.createConsumer(topic);


//        while(true){
//            TextMessage textMessage =(TextMessage) consumer.receive();
//            if(textMessage!=null){
//                System.out.println("消费者接受到消息"+textMessage.getText());
//            }
//            else {
//                break;
//            }
//        }
//        //9.关闭资源
//        consumer.close();
//        session.close();
//        connection.close();
        //通过监听的方式消费
        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                if (null!=message && message instanceof TextMessage){
                    TextMessage textMessage = (TextMessage) message;
                    try {
                        System.out.println("**消费者接受到消息  "+textMessage.getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        System.in.read();
        consumer.close();
        session.close();
        connection.close();
    }
}
