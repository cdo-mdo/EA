package org.edu.miu.cs.cs544.labw2d6.myfirstrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping(method = RequestMethod.GET, path="/hello")
    public String hello() {
        return "Hello World";
    }
}
