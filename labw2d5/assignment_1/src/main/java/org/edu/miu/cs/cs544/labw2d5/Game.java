package org.edu.miu.cs.cs544.labw2d5;

public class Game {
    private Vehicle car;
    private Vehicle bike;
    public Game() {

    }

    public void setCar(Vehicle car) {
        this.car = car;
    }
    public void setBike(Vehicle bike) {
        this.bike = bike;
    }
    public void play() {
        System.out.println("Game start");
        car.move();;
        bike.move();;
        System.out.println("Game end");
    }
}
