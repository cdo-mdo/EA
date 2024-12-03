package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Cacheable
@Inheritance (strategy = InheritanceType.JOINED)
public class Course {
    @Id@GeneratedValue
    private int id;
    private String title;
    private String name;
    private Date startDate;
    private String professor;

    public Course() {
    }
    public Course(String title, String name, Date startDate, String professor) {
        this.title = title;
        this.name = name;
        this.startDate = startDate;
        this.professor = professor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
