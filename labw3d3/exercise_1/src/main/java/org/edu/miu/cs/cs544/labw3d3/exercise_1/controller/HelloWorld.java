package org.edu.miu.cs.cs544.labw3d3.exercise_1.controller;

import org.edu.miu.cs.cs544.labw3d3.exercise_1.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    private Hello helloService;

    @RequestMapping (method = RequestMethod.GET, path ="")
    public String hello() {
        return "It works!";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String helloWorld() {
        return helloService.helloWorld();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    public String helloName(@PathVariable String name) {
        return helloService.hello(name);
    }

}
