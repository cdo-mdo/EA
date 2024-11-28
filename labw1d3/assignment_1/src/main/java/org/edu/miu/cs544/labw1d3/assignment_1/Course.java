package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Course {
    @Id@GeneratedValue
    private int id;
    private String title;
    private Date startDate;
    private String professor;

    public Course() {
    }
    public Course(String title, Date startDate, String professor) {
        this.title = title;
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
}
