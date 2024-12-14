package org.edu.miu.cs.cs544.labw3d3.exercise_1.controller;

import org.edu.miu.cs.cs544.labw3d3.exercise_1.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorld {

    @Autowired
    private Hello helloService;

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @RequestMapping (method = RequestMethod.GET, path ="")
    public String hello(@RequestHeader (name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("message.working", null, locale);
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
