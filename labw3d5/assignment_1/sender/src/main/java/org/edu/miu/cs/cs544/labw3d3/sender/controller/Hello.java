package org.edu.miu.cs.cs544.labw3d3.sender.controller;

import org.edu.miu.cs.cs544.labw3d3.sender.jms.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private Sender sender;

    @RequestMapping(method = RequestMethod.GET, path="/hello/{name}")
    public String helloName(@PathVariable("name") String name) {
        sender.sendMessage(name);
        return "send ---> " + name;
    }
}
