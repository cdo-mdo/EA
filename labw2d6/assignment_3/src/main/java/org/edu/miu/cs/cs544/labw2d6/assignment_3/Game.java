package org.edu.miu.cs.cs544.labw2d6.assignment_3;

public class Game {

    private Vehicle car;
    private Vehicle bike;

    public void setBike(Vehicle bike) {
        this.bike = bike;
    }
    public void setCar(Vehicle car) {
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

    public void count() {
        System.out.println("counting from Game ...");
        SingletonBeanCounter.counter++;
    }
}
