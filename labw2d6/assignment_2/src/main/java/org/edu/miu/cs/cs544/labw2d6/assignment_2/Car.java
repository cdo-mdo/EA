package org.edu.miu.cs.cs544.labw2d6.assignment_2;

import java.io.Serializable;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("moving at 50mph ...");
    }
}
