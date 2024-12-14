package org.edu.miu.cs.cs544.labw3d3.exercise_1.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@JacksonXmlRootElement
public class Student {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private double gpa;

    public Student() {

    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return this.gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
    }
}
