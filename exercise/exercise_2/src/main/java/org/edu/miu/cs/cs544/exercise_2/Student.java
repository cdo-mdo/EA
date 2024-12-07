package org.edu.miu.cs.cs544.exercise_2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double gpa;
    public Student() {
        super();
    }
    public Student(String name, double gpa) {
        super();
        this.name = name;
        this.gpa = gpa;
    }
}
