package org.edu.miu.cs.cs544.labw3d3.assignment_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("ControllerMessage")
public class Message {

    @Autowired
    private org.edu.miu.cs.cs544.labw3d3.assignment_3.service.Message serviceMessage;

    @GetMapping(path = "")
    public String welcome() {
        return "Welcome to Spring Boot";
    }

    @GetMapping(path = "/message/{message}")
    public String getMessage(@PathVariable("message") String message) {
        this.serviceMessage.sendMessage(message);
        return "send --> " + message;
    }



}
