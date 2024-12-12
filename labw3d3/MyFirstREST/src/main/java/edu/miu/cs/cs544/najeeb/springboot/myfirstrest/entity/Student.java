package edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id@GeneratedValue
    private int id;
    private String name;
    private int gpa;

    public Student() {
    }

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
