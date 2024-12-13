package org.edu.miu.cs.cs544.labw3d3.exercise_1;

import org.edu.miu.cs.cs544.labw3d3.exercise_1.repository.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {
    @Autowired
    Student studentRepository;

    @Override
    public void run(String... args) {
        System.out.println("DatabaseInitializer.run()");
        studentRepository.save(new org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student("Jack", 30));
        studentRepository.save(new org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student("John", 20));
        studentRepository.save(new org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student("Jill", 35));
        studentRepository.save(new org.edu.miu.cs.cs544.labw3d3.exercise_1.entity.Student("Jim", 28));
    }

}
