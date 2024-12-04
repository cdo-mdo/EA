package org.edu.miu.cs544.exercise_5;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne (cascade = CascadeType.PERSIST)
    private Department department;

    public Employee() {

    }
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }


}
