package edu.miu.cs.cs544.najeeb.springboot.myfirstrest.service;

import edu.miu.cs.cs544.najeeb.springboot.myfirstrest.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import edu.miu.cs.cs544.najeeb.springboot.myfirstrest.exception.UserNotFoundException;

@Service("StudentService")
public class Student {

    @Autowired
    edu.miu.cs.cs544.najeeb.springboot.myfirstrest.repository.Student  studentRepository;

    public List<edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student>
    getStudents() {
        return this.studentRepository.findAll();
    }

    public edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student
    getStudent(int id) {
        Optional<edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student>
                optionalStudent= this.studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        }
        else {
            throw new UserNotFoundException("id: "+id);
        }
    }
}
