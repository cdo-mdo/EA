package org.edu.miu.cs.cs544.labw3d3.assignment_2.jms;

import org.edu.miu.cs.cs544.labw3d3.assignment_2.entity.Student;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "${springjms.cs544queue}")
    public void receive(Student student) {
        System.out.println("Received <" + student.toString() + ">");
    }
}
