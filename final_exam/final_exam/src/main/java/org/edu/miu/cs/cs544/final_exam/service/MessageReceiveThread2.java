package org.edu.miu.cs.cs544.final_exam.service;

import org.edu.miu.cs.cs544.final_exam.jms.Subscriber2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiveThread2 implements Runnable {
    @Autowired
    private Subscriber2 subscriber2;

    @Override
    public void run() {
        System.out.println("Message receive thread 2 is running ...");
        subscriber2.subscribeMessage();
    }
}
