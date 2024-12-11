package edu.miu.cs.cs544.najeeb.midterm.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String code;
    private int capacity;

    @OneToMany
    private List<Student> students;

    @OneToOne
    private Person faculty;

    public Course() {

    }
    public Course(String title, String code, int capacity, Person faculty) {
        this.title = title;
        this.code = code;
        this.capacity = capacity;
        this.faculty = faculty;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
