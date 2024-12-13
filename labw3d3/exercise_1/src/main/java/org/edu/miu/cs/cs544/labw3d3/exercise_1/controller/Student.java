package org.edu.miu.cs.cs544.labw3d3.exercise_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("StudentController")
public class Student {
    @Autowired
    private org.edu.miu.cs.cs544.labw3d3.exercise_1.service.Student studentService;

    @GetMapping(path="/students/{id}")
    public org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student getStudent(@PathVariable int id) {
        return this.studentService.getStudent(id);
    }

    @GetMapping(path="/students")
    public List<org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student> getStudents() {
        return this.studentService.getStudents();
    }

    @PostMapping("/student")
    public org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student addStudents(@RequestBody org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student student) {
        System.out.println("StudentController.addStudents()");
        return this.studentService.add(student);
    }

    @PutMapping("/student/{id}")
    public org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student updateStudent(
            @RequestBody org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student student,
            @PathVariable int id) {
        return studentService.updateStudent(student, id);
    }
}
