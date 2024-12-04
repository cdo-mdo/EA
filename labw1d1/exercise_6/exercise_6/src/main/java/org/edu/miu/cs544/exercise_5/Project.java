package org.edu.miu.cs544.exercise_5;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Project {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany
    private Collection<Employee> employees;

    public Project() {

    }
    public Project(String name) {
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
