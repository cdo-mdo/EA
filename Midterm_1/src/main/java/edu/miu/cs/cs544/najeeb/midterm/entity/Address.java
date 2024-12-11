package edu.miu.cs.cs544.najeeb.midterm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private int id;

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {
        super();
    }
    public Address(String street, String city, String state, String zip) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

}
