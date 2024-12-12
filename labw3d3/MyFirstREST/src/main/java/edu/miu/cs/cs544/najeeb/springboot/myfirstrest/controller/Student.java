package edu.miu.cs.cs544.najeeb.springboot.myfirstrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("StudentController")
public class Student {

    @Autowired
    private edu.miu.cs.cs544.najeeb.springboot.myfirstrest.service.Student studentService;

    @GetMapping(path= "/students/{id}")
    public edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student
    getStudent(@PathVariable int id) {
        return this.studentService.getStudent(id);
    }

    @GetMapping(path= "/students")
    public List<edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student>
    getStudents() {
        return this.studentService.getStudents();
    }
}
