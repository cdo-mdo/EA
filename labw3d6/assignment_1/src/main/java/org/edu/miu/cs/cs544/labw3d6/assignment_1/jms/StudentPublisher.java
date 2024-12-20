package org.edu.miu.cs.cs544.labw3d6.assignment_1.jms;

import jakarta.jms.*;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.Entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentPublisher {
    private static final String BROKER_URL = "tcp://localhost:61616";
    private static final String TOPIC_NAME = "studentTopic";


    public void sendStudent(Student student) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);
        try (Connection connection = connectionFactory.createConnection()) {
            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Topic topic = session.createTopic(TOPIC_NAME);
            MessageProducer producer = session.createProducer(topic);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            ObjectMessage message = session.createObjectMessage(student);
            producer.send(message);

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
