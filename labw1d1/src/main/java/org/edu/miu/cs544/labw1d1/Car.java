package org.edu.miu.cs544.labw1d1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id@GeneratedValue
    private int id;
    private String model;
    private String make;
    private int year;
    private int mileage;

    public Car() {

    }

    public int getId() {
        return id;
    }

    public Car(String model, String make, int year, int mileage) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public int getYear() {
        return this.year;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car [id=" + id + ", model=" + model + ", make=" + make);
        builder.append(", year=" + year + ", mileage=" + mileage);
        builder.append("]");
        return builder.toString();
    }
}
