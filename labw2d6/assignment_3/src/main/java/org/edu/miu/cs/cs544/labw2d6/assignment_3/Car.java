package org.edu.miu.cs.cs544.labw2d6.assignment_3;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("moving at 50mph ...");
    }

    public void count() {
        System.out.println("counting from Car ...");
        PrototypeBeanCounter.counter++;
    }
}
