package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id@GeneratedValue
    private int id;
    private String name;
    private float gpa;

    @OneToOne (cascade = CascadeType.PERSIST)
    private Course courseAttending;

    @OneToMany (cascade = CascadeType.PERSIST)
    private List<Course> courseAttended;

    public Student() {
    }
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Course getCourseAttending() {
        return courseAttending;
    }

    public void setCourseAttending(Course courseAttending) {
        this.courseAttending = courseAttending;
    }

    public List<Course> getCourseAttended() {
        return courseAttended;
    }

    public void setCourseAttended(List<Course> courseAttended) {
        this.courseAttended = courseAttended;
    }
}
