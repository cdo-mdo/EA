package org.edu.miu.cs.cs544.labw3d6.assignment_1.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    @Value("${spring.jms.message.queue}")
    private String queueName;
    @Autowired
    private JmsTemplate jmsTemplate;

    public String receiveMessage() {
        return (String) jmsTemplate.receiveAndConvert(queueName);
    }
}
