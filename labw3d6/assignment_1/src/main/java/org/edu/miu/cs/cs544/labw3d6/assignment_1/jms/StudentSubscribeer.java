package org.edu.miu.cs.cs544.labw3d6.assignment_1.jms;

import jakarta.jms.*;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.Entity.Student;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentSubscribeer {
    private static final String BROKER_URL = "tcp://localhost:61616";
    private static final String TOPIC_NAME = "studentTopic";

    @Autowired
    private StudentRepository studentRepository;

    public void subscribeStudent() {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);
        try (Connection connection = connectionFactory.createConnection()) {
            connection.setClientID("studentSubscriber");
            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Topic topic = session.createTopic(TOPIC_NAME);

            // Create a durable consumer
            MessageConsumer consumer = session.createDurableSubscriber(topic, "studentSubscriber");
            while (true) {
                System.out.println("Waiting for object message: ... ");
                Message message = consumer.receive();

                if (message instanceof ObjectMessage) {
                    ObjectMessage objectMessage = (ObjectMessage) message;
                    Student student = (Student) objectMessage.getObject();
                    studentRepository.save(student);
                    System.out.println("Received and save student " + student);
                }
            }

        }
        catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
