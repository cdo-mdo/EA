package org.edu.miu.cs.cs544.labw3d3.exercise_1.service;

import java.util.List;
import java.util.Optional;

import org.edu.miu.cs.cs544.labw3d3.exercise_1.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("StudentService")
public class Student {
    @Autowired
    org.edu.miu.cs.cs544.labw3d3.exercise_1.repository.Student studentRepository;

    public List<org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student> getStudents() {
        return this.studentRepository.findAll();
    }

    public org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student getStudent(int id) {
        Optional<org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student>
                optionalStudent = this.studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        }
        else {
            throw new UserNotFoundException("id: " + id);
        }
    }

    public org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student add(org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student student) {
        System.out.println("StudentService.add()");
        return this.studentRepository.save(student);
    }

    public org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student updateStudent(
            org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student student, int id) {
        return studentRepository.findById(id).map(s -> {
            s.setName(student.getName());
            s.setGpa(student.getGpa());
            return studentRepository.save(s);
        }).orElseGet(() -> {
            return studentRepository.save(student);
        });
    }
}
