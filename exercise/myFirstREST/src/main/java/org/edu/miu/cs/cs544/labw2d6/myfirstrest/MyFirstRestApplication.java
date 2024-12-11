package org.edu.miu.cs.cs544.labw2d6.myfirstrest;

import org.edu.miu.cs.cs544.labw2d6.myfirstrest.controller.HelloWorld;
import org.edu.miu.cs.cs544.labw2d6.myfirstrest.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyFirstRestApplication {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyFirstRestApplication.class, args);
    }

}
