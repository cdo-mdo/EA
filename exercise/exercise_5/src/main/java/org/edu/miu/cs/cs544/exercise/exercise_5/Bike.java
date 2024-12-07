package org.edu.miu.cs.cs544.exercise.exercise_5;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Bike {
    private int tyreSize;
    private String brand;

    public Bike() {

    }

    public Bike(int tyreSize) {
        this.tyreSize = tyreSize;
    }

    public Bike(int tyreSize, String brand) {
        this.tyreSize = tyreSize;
        this.brand = brand;
    }
    public int getTyreSize() {
        return tyreSize;
    }
    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bike [tyreSize=");
        builder.append(tyreSize);
        builder.append(", brand=");
        builder.append(brand);
        builder.append("]");
        return builder.toString();
    }
}
