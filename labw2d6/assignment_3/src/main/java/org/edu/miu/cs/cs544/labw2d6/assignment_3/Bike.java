package org.edu.miu.cs.cs544.labw2d6.assignment_3;

public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("moving at 10mph ...");
    }

    public void count() {
        System.out.println("counting from Bike ...");
        PrototypeBeanCounter.counter++;
    }
}
