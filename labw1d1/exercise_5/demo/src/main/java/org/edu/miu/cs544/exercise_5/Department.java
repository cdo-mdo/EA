package org.edu.miu.cs544.exercise_5;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Department {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private Collection<Employee> employees;

    public Department() {

    }
    public Department(String name) {
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

    public Collection<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }



}
