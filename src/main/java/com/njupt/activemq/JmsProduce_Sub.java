package com.njupt.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JmsProduce_Sub {
    public static final  String ACTIVEMQ_URL = "tcp://192.168.40.133:61616";
    public static final  String TOPIC_NAME = "topic_Persist";
    public static void main(String[] args) {
//        1.创建连接工厂
        ActiveMQConnectionFactory factory =
                new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        try {
            //2.通过连接工厂，获得connection并启动
            Connection connection =factory.createConnection();

            //3.创建Session,两个参数，事物(预防出错，可回滚)；签收
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            //Destination destination = session.createQueue(QUEUE_NAME);
            //4.创建目的地
            Topic queue = session.createTopic(TOPIC_NAME);
            //5.创建消息生产者
            MessageProducer producer = session.createProducer(queue);

            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            connection.start();
            //6.通过producer生产消息
            for(int i=1;i<=3;i++){
                //7.创建消息
                TextMessage message =session.createTextMessage("TOPIC_NAME---"+i);
                //8.通过producer发送给mq
                producer.send(message);
            }
            //9.关闭资源
            producer.close();
            session.commit();//事物提交，不提交无法生产消息
            session.close();
            connection.close();
            System.out.println("TOPIC_NAME消息发送完成");
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
