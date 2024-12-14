package org.edu.miu.cs.cs544.labw3d3.assignment_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("StudentController")
public class Student {

    @Autowired
    org.edu.miu.cs.cs544.labw3d3.assignment_2.service.Student studentService;

    @PostMapping(value = "/student")
    public org.edu.miu.cs.cs544.labw3d3.assignment_2.entity.Student
        addStudent(@RequestBody org.edu.miu.cs.cs544.labw3d3.assignment_2.entity.Student student) {
        return studentService.addStudent(student);
    }
}
