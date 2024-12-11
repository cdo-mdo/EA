package edu.miu.cs.cs544.najeeb.midterm.entity;

import jakarta.persistence.Entity;

@Entity
public class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }
    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
