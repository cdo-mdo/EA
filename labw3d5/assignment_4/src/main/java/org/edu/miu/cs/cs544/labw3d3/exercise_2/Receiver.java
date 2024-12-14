package org.edu.miu.cs.cs544.labw3d3.exercise_2;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receive(Email email) {
        System.out.println("Received email: " + email);
    }
}
