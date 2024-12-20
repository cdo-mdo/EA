package org.edu.miu.cs.cs544.labw3d6.assignment_1.service;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.jms.MessageReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiveThread implements Runnable {
    @Autowired
    private MessageReceiver receiver;

    @Override
    public void run() {
        System.out.println("ReceiveThread is running...");
        while (true) {
            String message = receiver.receiveMessage();
            System.out.println("Received message: " + message);
        }
    }
}
