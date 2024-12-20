package org.edu.miu.cs.cs544.labw3d6.assignment_1.jms;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.Entity.Student;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentReceiver {
    @Value("${spring.jms.student.queue}")
    private String queueName;

    @Autowired
    private JmsTemplate jmsTemplate;
    public Student receiveStudent() {
        return (Student) jmsTemplate.receiveAndConvert(queueName);
    }
}
