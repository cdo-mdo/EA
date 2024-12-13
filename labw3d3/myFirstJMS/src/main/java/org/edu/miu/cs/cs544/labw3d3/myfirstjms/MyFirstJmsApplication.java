package org.edu.miu.cs.cs544.labw3d3.myfirstjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJMS
public class MyFirstJmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstJmsApplication.class, args);
    }

}
