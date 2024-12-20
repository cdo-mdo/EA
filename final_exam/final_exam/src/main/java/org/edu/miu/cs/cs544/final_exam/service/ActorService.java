package org.edu.miu.cs.cs544.final_exam.service;

import org.edu.miu.cs.cs544.final_exam.entity.Actor;
import org.edu.miu.cs.cs544.final_exam.jms.Publisher;
import org.edu.miu.cs.cs544.final_exam.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private Publisher publisher;

    public Actor getActorByName(String name) {
        return actorRepository.findActorsByName(name);
    }

    public void sendActorName(String name) {
        publisher.publish(name);
    }
}
