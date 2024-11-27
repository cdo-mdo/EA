package org.edu.miu.cs544.labw1d2.assignment_2;

import jakarta.persistence.*;
import net.bytebuddy.build.Plugin;

@Entity
public class Car {
    @Id@GeneratedValue
    private int id;
    private String make;
    private String model;
    private int year;

    @OneToOne (cascade = CascadeType.PERSIST)
    private Person owner;

    public Person getDriver() {
        return driver;
    }
    public void setDriver(Person driver) {
        this.driver = driver;
    }

    @OneToOne (cascade = CascadeType.PERSIST)
    private Person driver;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Car() {

    }
    public Car(int id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {

    }

}
