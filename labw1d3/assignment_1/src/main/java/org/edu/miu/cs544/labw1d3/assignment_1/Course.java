package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class Course {
    @Id@GeneratedValue
    private int id;
    private String title;
    private String name;
    private Date startDate;
    private String professor;

    @OneToMany (mappedBy = "courseAttending")
    private List<Student> attendingStudents;

    @ManyToMany (mappedBy = "coursesAttended")
    private List<Student> attendedStudents;

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

    public List<Student> getAttendingStudents() {
        return attendingStudents;
    }
    public void setAttendingStudents(List<Student> attendingStudents) {
        this.attendingStudents = attendingStudents;
    }
    public List<Student> getAttendedStudents() {
        return attendedStudents;
    }
    public void setAttendedStudents(List<Student> attendedStudents) {
        this.attendedStudents = attendedStudents;
    }
}
