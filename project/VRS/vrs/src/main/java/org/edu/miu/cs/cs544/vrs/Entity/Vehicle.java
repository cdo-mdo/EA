package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private String licensePlate;
    private String make;
    private String model;
    private String color;
    private int year;
    private VehicleStatus status;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    @OneToOne (mappedBy = "vehicle", cascade = CascadeType.ALL, optional = true)
    private Reservation currentReservation;

    @OneToOne (mappedBy = "vehicle", cascade = CascadeType.ALL, optional = true)
    private Rental currentRental;

    @OneToMany (mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    Collection<MaintenanceRecord> maintenanceRecords;

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
    public Branch getBranch() {
        return branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "Vehicle [vehicleId=" + vehicleId + ", licensePlate=" + licensePlate + ", make=" + make + ", model="
                + model + ", color=" + color + ", year=" + year + "]";
    }
}
