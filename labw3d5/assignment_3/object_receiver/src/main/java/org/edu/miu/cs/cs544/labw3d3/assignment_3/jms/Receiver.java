package org.edu.miu.cs.cs544.labw3d3.assignment_3.jms;

import org.edu.miu.cs.cs544.labw3d3.assignment_3.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

@Component
public class Receiver {

    @JmsListener(destination = "${spring.jms.object.queue}")
    public void receiveMessage(Student student) {
        System.out.println("Received message: " + student);
    }
}
