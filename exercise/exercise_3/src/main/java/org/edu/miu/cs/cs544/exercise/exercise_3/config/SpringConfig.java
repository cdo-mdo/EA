package org.edu.miu.cs.cs544.exercise.exercise_3.config;

import org.edu.miu.cs.cs544.exercise.exercise_3.Bike;
import org.edu.miu.cs.cs544.exercise.exercise_3.Car;
import org.edu.miu.cs.cs544.exercise.exercise_3.Game;
import org.edu.miu.cs.cs544.exercise.exercise_3.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class SpringConfig {
    @Bean
    public Vehicle vehicle() {
        return new Bike();
    }

    @Bean
    public Game game(Vehicle vehicle) {
        return new Game(vehicle);
    }
}