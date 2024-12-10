package edu.miu.cs.cs544.najeeb.midterm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    protected String name;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }

}
