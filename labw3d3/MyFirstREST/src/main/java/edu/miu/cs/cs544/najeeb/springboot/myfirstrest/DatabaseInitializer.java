package edu.miu.cs.cs544.najeeb.springboot.myfirstrest;

import edu.miu.cs.cs544.najeeb.springboot.myfirstrest.repository.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    Student studentRepository;

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student("Jack", 30));
        studentRepository.save(new edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student("John", 20));
        studentRepository.save(new edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student("Jill", 35));
        studentRepository.save(new edu.miu.cs.cs544.najeeb.springboot.myfirstrest.entity.Student("Jim", 28));
    }
}
