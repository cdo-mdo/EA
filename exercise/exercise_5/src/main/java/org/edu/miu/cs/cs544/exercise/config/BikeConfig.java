package org.edu.miu.cs.cs544.exercise.config;

import org.edu.miu.cs.cs544.exercise.exercise_5.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BikeConfig {
    @Bean
    public Bike bike() {
        Bike bike = new Bike();
        bike.setTyreSize(17);
        bike.setBrand("BMW");
        return bike;
    }
}
