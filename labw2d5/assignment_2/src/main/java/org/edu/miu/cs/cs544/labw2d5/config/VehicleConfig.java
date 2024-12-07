package org.edu.miu.cs.cs544.labw2d5.config;

import org.edu.miu.cs.cs544.labw2d5.assignment_2.Bike;
import org.edu.miu.cs.cs544.labw2d5.assignment_2.Car;
import org.edu.miu.cs.cs544.labw2d5.assignment_2.Game;
import org.edu.miu.cs.cs544.labw2d5.assignment_2.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {
    @Bean
    public Bike bike() {
        return new Bike();
    }

    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Game game() {
        return new Game();
    }

}
