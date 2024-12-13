package org.edu.miu.cs.cs544.labw3d3.exercise_1.service;

import org.springframework.stereotype.Service;

@Service
public class Hello {
    public String helloWorld() {
        return "Hello World!";
    }

    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
