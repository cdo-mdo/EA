package org.edu.miu.cs.cs544.labw3d3.assignment_3.jms;

import org.edu.miu.cs.cs544.labw3d3.assignment_3.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;

@Component
public class Sender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${spring.jms.message.queue}")
    private String messageQueue;

    @Value("${spring.jms.object.queue}")
    private String objectQueue;

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(messageQueue, message);
    }

    public void sendObject(Student student) {
        jmsTemplate.convertAndSend(objectQueue, student);
    }

}
