package org.edu.miu.cs.cs544.labw3d2.exercise_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(name = "User")
    public String greeting() {
        return "Hello World ...";
    }
}
