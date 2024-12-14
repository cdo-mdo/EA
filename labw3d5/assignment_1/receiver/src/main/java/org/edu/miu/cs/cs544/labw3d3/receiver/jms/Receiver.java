package org.edu.miu.cs.cs544.labw3d3.receiver.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "${springjms.cs544queue}")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
