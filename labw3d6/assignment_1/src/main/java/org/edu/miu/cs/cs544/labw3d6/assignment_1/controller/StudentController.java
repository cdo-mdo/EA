package org.edu.miu.cs.cs544.labw3d6.assignment_1.controller;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.Entity.Student;
import org.edu.miu.cs.cs544.labw3d6.assignment_1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping ("/student")
    public String getStudent(@RequestBody Student student) {
        studentService.sendStudent(student);
        return "Student sent " + student.toString();
    }
}
