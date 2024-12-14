package org.edu.miu.cs.cs544.labw3d3.sender;

import org.edu.miu.cs.cs544.labw3d3.sender.jms.Sender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SenderApplication {

    @Bean
    public Sender sender() {
        return new Sender();
    }

    public static void main(String[] args) {
        SpringApplication.run(SenderApplication.class, args);
    }

}
