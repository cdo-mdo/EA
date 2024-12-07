package org.edu.miu.cs.cs544.labw2d5.assignment_2;

import org.springframework.beans.factory.annotation.Autowired;

public class Game {
    @Autowired
    private Vehicle car;
    @Autowired
    private Vehicle bike;

    public Game() {

    }

    public void play() {
        System.out.println("Game start");
        car.move();
        bike.move();
        System.out.println("Game end");
    }
}
