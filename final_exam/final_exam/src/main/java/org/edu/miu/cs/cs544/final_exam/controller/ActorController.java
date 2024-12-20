package org.edu.miu.cs.cs544.final_exam.controller;

import org.edu.miu.cs.cs544.final_exam.entity.Actor;
import org.edu.miu.cs.cs544.final_exam.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/actors/{name}")
    public Actor getActorsByName(@PathVariable String name) {
        return actorService.getActorByName(name);
    }

    @GetMapping("/actorName/{name}")
    public String sendMessage(@PathVariable String name) {
        actorService.sendActorName(name);
        return "Name sent " + name;
    }
}
