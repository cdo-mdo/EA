package org.edu.miu.cs.cs544.exercise.exercise_3.config;

import org.edu.miu.cs.cs544.exercise.exercise_3.Bike;
import org.edu.miu.cs.cs544.exercise.exercise_3.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {
    @Bean
    public Vehicle vehicle() {
        return new Bike();
    }
}
