package org.edu.miu.cs.cs544.labw2d6.myfirstrest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class HelloService {
    @RequestMapping(method = RequestMethod.GET, path="/hello")
    public String sayHello() {
        return "Hello World";
    }
}
