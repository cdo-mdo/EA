package org.edu.miu.cs.cs544.labw3d3.assignment_3.jms;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

@Component
public class Receiver {

    @JmsListener(destination = "${spring.jms.message.queue}")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }


}
