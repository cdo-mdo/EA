package org.edu.miu.cs.cs544.labw2d6.assignment_2;

public class Game {
    private Vehicle car;
    private Vehicle bike;

    public void setBike(Bike bike) {
        this.bike = bike;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public Game() {

    }

    public void play() {
        System.out.println("Game start");
        car.move();
        bike.move();
        System.out.println("Game end");
    }
}
