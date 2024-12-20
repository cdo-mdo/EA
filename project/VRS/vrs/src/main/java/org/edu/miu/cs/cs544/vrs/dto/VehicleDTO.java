package org.edu.miu.cs.cs544.vrs.dto;

public class VehicleDTO {
    private String licensePlate;
    private String make;
    private String model;
    private String color;
    private int year;
    private String status;

    // For Car
    private int seatCapacity;
    private String fuelType;

    // For Bike
    private String engineCapacity;

    // For Truck
    private int payloadCapacity;

    public VehicleDTO() {

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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public String getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public int getPayloadCapacity() {
        return payloadCapacity;
    }
    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }
}
