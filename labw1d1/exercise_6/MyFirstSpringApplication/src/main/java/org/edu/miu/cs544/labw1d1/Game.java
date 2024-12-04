package org.edu.miu.cs544.labw1d1;

public class Game {
    private Vehicle vehicle;
    public void play() {
        vehicle.move();
    }

    public Game() {

    }

    public Game(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
