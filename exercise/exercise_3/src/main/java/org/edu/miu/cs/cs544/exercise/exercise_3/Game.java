package org.edu.miu.cs.cs544.exercise.exercise_3;

public class Game {
    private Vehicle vehicle;
    public Game(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void play() {
        vehicle.move();
    }
}
