package edu.miu.cs.cs544.najeeb.springboot.myfirstrest.service;

import org.springframework.stereotype.Service;

@Service
public class Hello {

    public String helloWorld() {
        return "Hello World..........";
    }

    public String hello(String name) {
        return "Hello "+name+"!";
    }
}
