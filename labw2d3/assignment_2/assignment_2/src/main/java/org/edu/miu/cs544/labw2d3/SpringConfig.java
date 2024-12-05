package org.edu.miu.cs544.labw2d3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Vehicle vehicle() {
        return new Bike();
    }

    @Bean
    public Game game() {
        return new Game(vehicle());
    }
}
