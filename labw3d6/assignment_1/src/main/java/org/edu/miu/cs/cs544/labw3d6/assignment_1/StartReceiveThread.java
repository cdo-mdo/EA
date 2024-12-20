package org.edu.miu.cs.cs544.labw3d6.assignment_1;


import org.edu.miu.cs.cs544.labw3d6.assignment_1.service.MessageReceiveThread;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.service.StudentReceiveThread;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.service.StudentSubscriberThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartReceiveThread implements CommandLineRunner {
    @Autowired
    private MessageReceiveThread receiveThread;

    @Autowired
    private StudentReceiveThread studentReceiveThread;

    @Autowired
    private StudentSubscriberThread studentSubscriberThread;

    @Override
    public void run(String... args) throws Exception {
        new Thread(receiveThread).start();
        new Thread(studentReceiveThread).start();
        new Thread(studentSubscriberThread).start();
    }
}

