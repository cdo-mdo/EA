package org.edu.miu.cs.cs544.labw3d3.assignment_3.service;

import org.edu.miu.cs.cs544.labw3d3.assignment_3.jms.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component( "ServiceStudent")
public class Student {

    @Autowired
    private Sender sender;

    public void sendStudent(org.edu.miu.cs.cs544.labw3d3.assignment_3.entity.Student student) {
        sender.sendObject(student);
    }
}
