package org.edu.miu.cs.cs544.labw3d6.assignment_1.service;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.Entity.Student;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.jms.StudentPublisher;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.jms.StudentSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
    @Autowired
    private StudentSender sender;

    @Autowired
    private StudentPublisher publisher;

    public void sendStudent(Student student) {
        sender.sendStudent(student);
        publisher.sendStudent(student);
    }
}
