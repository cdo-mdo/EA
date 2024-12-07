package org.edu.miu.cs.cs544.exercise.exercise_5;

public class Car {
    private int year;
    private String make;
    private String model;
    private int millage;

    public void init() {
        System.out.println("Car init");
    }

    public void destroy() throws Exception {
        System.out.println("Car destroy");
    }

    public Car(int year, String make, String model, int millage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.millage = millage;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car [year=");
        builder.append(year);
        builder.append(", make=");
        builder.append(make);
        builder.append(", model=");
        builder.append(model);
        builder.append(", millage=");
        builder.append(millage);
        builder.append("]");

        return builder.toString();
    }
}
