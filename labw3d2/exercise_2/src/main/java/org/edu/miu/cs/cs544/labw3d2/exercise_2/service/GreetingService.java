package org.edu.miu.cs.cs544.labw3d2.exercise_2.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingService {
    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }
}
