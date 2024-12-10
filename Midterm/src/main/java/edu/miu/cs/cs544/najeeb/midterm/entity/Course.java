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

    @OneToMany (cascade = CascadeType.PERSIST)
    private List<Student> students;

    @OneToOne (cascade = CascadeType.PERSIST)
    Faculty faculty;

    public Course() {
        students = new ArrayList<Student>();
    }
    public Course(String title, String code, int capacity, Faculty faculty) {
        this();
        this.title = title;
        this.code = code;
        this.capacity = capacity;
        this.faculty = faculty;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getCapacity() {
        return capacity;
    }

}
