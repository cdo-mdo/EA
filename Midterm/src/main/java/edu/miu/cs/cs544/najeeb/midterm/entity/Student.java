package edu.miu.cs.cs544.najeeb.midterm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student extends Person {
    @Id
    @GeneratedValue
    private int id;

    private double gpa;

    @ManyToOne
    Course course;

    public Student() {

    }
    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
