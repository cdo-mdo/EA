package org.edu.miu.cs.cs544.labw3d3.assignment_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("StudentService")
public class Student {

    @Autowired
    private org.edu.miu.cs.cs544.labw3d3.assignment_2.repository.Student studentRepository;

    @Autowired
    private org.edu.miu.cs.cs544.labw3d3.assignment_2.jms.Sender sender;

    public org.edu.miu.cs.cs544.labw3d3.assignment_2.entity.Student addStudent(
            org.edu.miu.cs.cs544.labw3d3.assignment_2.entity.Student student) {

        sender.sendMessage(student);
        return this.studentRepository.save(student);

    }
}
