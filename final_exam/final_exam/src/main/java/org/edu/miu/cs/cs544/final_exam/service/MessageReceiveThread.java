package org.edu.miu.cs.cs544.final_exam.service;

import org.edu.miu.cs.cs544.final_exam.jms.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiveThread implements Runnable {

    @Autowired
    private Subscriber subscriber;

    @Override
    public void run() {
        System.out.println("Message receive thread is running ...");
        Subscriber subscriber = new Subscriber();
        subscriber.subscribeMessage();
    }

}
