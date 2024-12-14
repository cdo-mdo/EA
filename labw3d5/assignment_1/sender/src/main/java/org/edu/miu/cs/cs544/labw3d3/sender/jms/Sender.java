package org.edu.miu.cs.cs544.labw3d3.sender.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value(value = "${springjms.cs544queue}")
    private String queueName;

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(queueName, message);
    }

}
