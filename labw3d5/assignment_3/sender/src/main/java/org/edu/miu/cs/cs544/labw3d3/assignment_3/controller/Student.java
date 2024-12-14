package org.edu.miu.cs.cs544.labw3d3.assignment_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("StudentController")
public class Student {

    @Autowired
    private org.edu.miu.cs.cs544.labw3d3.assignment_3.service.Student serviceStudent;

    @PostMapping(path = "/student")
    public String addStudent(org.edu.miu.cs.cs544.labw3d3.assignment_3.entity.Student student) {
        this.serviceStudent.sendStudent(student);
        return "send --> " + student.toString();
    }
}
