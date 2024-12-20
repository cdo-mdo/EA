package org.edu.miu.cs.cs544.final_exam.jms;

import jakarta.jms.Connection;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Session;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private static final String BROKER_URL = "tcp://localhost:61616";
    private static final String TOPIC_NAME = "messageTopic";

    public void publish(String message) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        try (Connection connection = connectionFactory.createConnection()) {
            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            session.createProducer(session.createTopic(TOPIC_NAME)).send(session.createTextMessage(message));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

