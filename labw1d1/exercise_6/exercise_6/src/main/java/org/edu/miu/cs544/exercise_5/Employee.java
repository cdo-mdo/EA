package org.edu.miu.cs544.exercise_5;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "employees")
    private Collection<Project> projects;

    public Employee() {

    }
    public Employee(String name, Collection<Project> projects) {
        this.name = name;
        this.projects = projects;
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

    public Collection<Project> getProjects() {
        return projects;
    }
    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }
}
