package edu.miu.cs.cs544.najeeb.midterm.aspects;

import org.springframework.aop.BeforeAdvice;

public class Logging implements BeforeAdvice {
    public void BeforeRunning(Object object, Class target) {
        System.out.println("AOP running");
    }
}
