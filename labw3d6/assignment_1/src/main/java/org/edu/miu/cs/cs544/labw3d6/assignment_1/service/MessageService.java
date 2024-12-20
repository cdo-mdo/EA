package org.edu.miu.cs.cs544.labw3d6.assignment_1.service;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.jms.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    @Autowired
    private MessageSender sender;

    public void processMessage(String message) {
        sender.sendMessage(message);
    }
}
