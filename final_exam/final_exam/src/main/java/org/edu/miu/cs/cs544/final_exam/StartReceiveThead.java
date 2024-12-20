package org.edu.miu.cs.cs544.final_exam;

import org.edu.miu.cs.cs544.final_exam.service.MessageReceiveThread;
import org.edu.miu.cs.cs544.final_exam.service.MessageReceiveThread2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartReceiveThead implements CommandLineRunner {

    @Autowired
    private MessageReceiveThread thread1;
    @Autowired
    private MessageReceiveThread2 thread2;

    @Override
    public void run(String... args) throws Exception {
        
        thread2.run();
        thread1.run();
    }
}
