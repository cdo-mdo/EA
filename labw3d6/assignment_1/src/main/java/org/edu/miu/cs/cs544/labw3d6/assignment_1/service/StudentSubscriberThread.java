package org.edu.miu.cs.cs544.labw3d6.assignment_1.service;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.jms.StudentSubscribeer;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentSubscriberThread implements Runnable {
    @Autowired
    private StudentSubscribeer studentSubscriber;

    @Override
    public void run() {
        System.out.println("StudentSubscriberThread is running...");
        studentSubscriber.subscribeStudent();
    }

}
