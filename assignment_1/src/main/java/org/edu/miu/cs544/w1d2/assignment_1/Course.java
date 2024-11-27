package org.edu.miu.cs544.w1d2.assignment_1;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id@GeneratedValue
    private int id;
    private String title;
    private int capacity;
    private String room;
    private String number;

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoom() {
        return room;
    }

    public String getNumber() {
        return number;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @OneToMany (cascade = CascadeType.PERSIST)
    private List<Student> students;

    public Course() {
        students = new ArrayList<Student>();
    }

    public Course(String title, int capacity, String room, String number) {
        this();
        this.title = title;
        this.capacity = capacity;
        this.room = room;
        this.number = number;
    }

    public void addStudent(Student student) {
        students.add(student);
    }


}
