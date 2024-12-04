package org.edu.miu.cs544.labw1d1.exercise_4;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne
    private Cubicle assignedCubicle;

    public Employee() {

    }
    public Employee(String name) {
        this.name = name;
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


    public Cubicle getAssignedCubicle() {
        return assignedCubicle;
    }

    public void setAssignedCubicle(Cubicle assignedCubicle) {
            this.assignedCubicle = assignedCubicle;
    }
}
