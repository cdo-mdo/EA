package org.edu.miu.cs.cs544.labw3d6.assignment_1.jms;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentSender {
    @Value("${spring.jms.student.queue}")
    private String queueName;

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendStudent(Student student) {
        jmsTemplate.convertAndSend(queueName, student);
    }
}
