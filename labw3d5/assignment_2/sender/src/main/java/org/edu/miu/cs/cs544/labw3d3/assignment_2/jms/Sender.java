package org.edu.miu.cs.cs544.labw3d3.assignment_2.jms;

import org.edu.miu.cs.cs544.labw3d3.assignment_2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springjms.cs544queue}")
    private String queueName;

    public void sendMessage(Student student) {
        jmsTemplate.convertAndSend(queueName, student);
    }
}
