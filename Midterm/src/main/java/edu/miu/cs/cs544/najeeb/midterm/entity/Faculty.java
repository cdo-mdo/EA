package edu.miu.cs.cs544.najeeb.midterm.entity;

import jakarta.persistence.*;

@Entity
@Cacheable(false)
public class Faculty extends Person {
    @Id
    @GeneratedValue
    private int id;

    private String department;

    @OneToOne
    Course course;

    @OneToOne (cascade = CascadeType.PERSIST)
    Address address;

    public Faculty() {
        super();
    }

    public Faculty(String name, String department, Address address) {
        super(name);
        this.department = department;
        this.address = address;
    }

}
