package org.edu.miu.cs.cs544.exercise.config;

import org.edu.miu.cs.cs544.exercise.exercise_5.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean (initMethod = "init")
    public Car vehicle() {
        return new Car(2024, "Toyota", "Prius", 66000);
    }
}
