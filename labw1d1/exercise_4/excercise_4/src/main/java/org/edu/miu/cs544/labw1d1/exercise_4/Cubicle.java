package org.edu.miu.cs544.labw1d1.exercise_4;

import jakarta.persistence.*;

@Entity
public class Cubicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    @OneToOne(mappedBy = "assignedCubicle")
    private Employee employee;

    public Cubicle() {

    }
    public Cubicle(String title, Employee employee) {
        this.title = title;
        this.employee = employee;
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


    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
