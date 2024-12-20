package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private int seatingCapacity;
    private FuelType fuelType;
}
