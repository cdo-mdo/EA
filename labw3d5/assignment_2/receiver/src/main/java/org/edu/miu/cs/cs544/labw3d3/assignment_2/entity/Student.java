package org.edu.miu.cs.cs544.labw3d3.assignment_2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private double gpa;

    public Student() {
    }
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gpa=" + gpa + '}';
    }

}
