package org.edu.miu.cs.cs544.exercise.config;

import org.edu.miu.cs.cs544.exercise.exercise_5.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BikeConfig1 {
    @Bean
    public Bike bike() {
        Bike bike = new Bike(20);
        bike.setBrand("Volkswagen");
        return bike;
    }
}
