package org.edu.miu.cs.cs544.vrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class VrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VrsApplication.class, args);
    }

}
