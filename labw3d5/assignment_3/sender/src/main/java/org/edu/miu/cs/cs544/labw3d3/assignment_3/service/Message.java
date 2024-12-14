package org.edu.miu.cs.cs544.labw3d3.assignment_3.service;

import org.edu.miu.cs.cs544.labw3d3.assignment_3.jms.Sender;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component( "ServiceMessage")
public class Message {

    @Autowired
    private Sender sender;

    public void sendMessage(String message) {
        sender.sendMessage(message);
    }
}
