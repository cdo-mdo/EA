package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleId;

    private String licensePlate;
    private String make;
    private String model;
    private String color;
    private int year;
    private VehicleStatus status;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String make, String model, String color, int year) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
    public VehicleStatus getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return "Vehicle [vehicleId=" + vehicleId + ", licensePlate=" + licensePlate + ", make=" + make + ", model="
                + model + ", color=" + color + ", year=" + year + "]";
    }
}
