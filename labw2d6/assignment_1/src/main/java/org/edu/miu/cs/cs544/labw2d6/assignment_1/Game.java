package org.edu.miu.cs.cs544.labw2d6.assignment_1;

public class Game {
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void play() {
        System.out.println("Game start");
        vehicle.move();
        System.out.println("Game end");
    }
}
