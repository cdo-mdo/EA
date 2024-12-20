package org.edu.miu.cs.cs544.final_exam.jms;

import jakarta.jms.*;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.stereotype.Component;

@Component
public class Subscriber2 {
    private static final String BROKER_URL = "tcp://localhost:61616";
    private static final String TOPIC_NAME = "messageTopic";

    public void subscribeMessage() {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);
        try (Connection connection = connectionFactory.createConnection()) {
            connection.setClientID("id2");
            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Topic topic = session.createTopic(TOPIC_NAME);

            MessageConsumer consumer = session.createDurableConsumer(topic, TOPIC_NAME);
            while (true) {
                TextMessage message = (TextMessage) consumer.receive();
                if (message != null) {
                    System.out.println("Day " + message.getText() + " is off is Wednesday!!!");
                }
            }
        }
        catch (JMSException e) {
            e.getMessage();
        }
    }
}
