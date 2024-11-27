package org.edu.miu.cs544.w1d2.assignment_1;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double gpa;

    //private Course course;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
        this.gpa = 0.0;
    }

    //public Course getCourse() {
    //    return course;
    //}

    //public void setCourse(Course course) {
    //    this.course = course;
    //}

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}
