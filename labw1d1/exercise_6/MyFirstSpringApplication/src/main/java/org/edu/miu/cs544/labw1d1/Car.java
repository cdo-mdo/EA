package org.edu.miu.cs544.labw1d1;

import java.io.Serializable;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving at 50mph");
    }
}
