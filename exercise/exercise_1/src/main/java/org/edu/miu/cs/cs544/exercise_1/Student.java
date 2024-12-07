package org.edu.miu.cs.cs544.exercise_1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double gpa;

    public Student() {

    }
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}
