package org.edu.miu.cs.cs544.labw3d6.assignment_1.service;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.Entity.Student;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.jms.StudentReceiver;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentReceiveThread implements Runnable {
    @Autowired
    private StudentReceiver receiver;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run() {
        System.out.println("Student ReceiveThread is running...");
        while (true) {
            Student student = receiver.receiveStudent();
            System.out.println("Received and save student: " + student);
            studentRepository.save(student);
        }
    }

}
