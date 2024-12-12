package edu.miu.cs.cs544.najeeb.springboot.myfirstrest;

import edu.miu.cs.cs544.najeeb.springboot.myfirstrest.service.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyFirstRestApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyFirstRestApplication.class, args);
    }

}
