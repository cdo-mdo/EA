package org.edu.miu.cs.cs544.labw3d6.assignment_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
public class GreetingController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/greeting")
    public String greeting(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        System.out.println("Locale: " + locale);
        return messageSource.getMessage("message.welcome", null, locale);

    }

//    @RequestMapping (method = RequestMethod.GET, path ="/hello")
//    public String hello(@RequestHeader (name = "Accept-Language", required = false) Locale locale) {
//        return messageSource.getMessage("message.welcome", null, locale);
//    }
}
