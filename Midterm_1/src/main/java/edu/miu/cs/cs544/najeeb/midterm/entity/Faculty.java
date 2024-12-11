package edu.miu.cs.cs544.najeeb.midterm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Faculty extends Person{
    private String department;

    @OneToOne
    private Address address;

    public Faculty() {
        super();
    }

    public Faculty(String name, String department, Address address) {
        super(name);
        this.department = department;
        this.address = address;
    }

}
