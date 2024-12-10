package edu.miu.cs.cs544.najeeb.midterm.config;

import edu.miu.cs.cs544.najeeb.midterm.entity.Address;
import edu.miu.cs.cs544.najeeb.midterm.entity.Course;
import edu.miu.cs.cs544.najeeb.midterm.entity.Faculty;
import edu.miu.cs.cs544.najeeb.midterm.entity.Student;
import edu.miu.cs.cs544.najeeb.midterm.service.CRUD_Service;
import jakarta.persistence.Cacheable;
import org.eclipse.persistence.annotations.Cache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
    @Bean (name = "crudService")
    @Scope (value = "prototype")
    CRUD_Service crudService() {
        return new CRUD_Service("midterm");
    }

    @Bean (name = "fairfield")
    Address address1() {
        return new Address("1000 N 4th Street", "FairField", "Iowa", "52556");
    }

    @Bean (name = "miami")
    Address address2() {
        return new Address("1016 W Flagler Street", "Miami", "Florida", "33130");
    }

    @Bean (name = "najeeb")
    Faculty faculty1() {
        return new Faculty("Najeeb", "cs", address1());
    }

    @Bean (name = "muhyieddin")
    Faculty faculty2() {
        return new Faculty("Muhyieddin", "cs", address2());
    }

    @Bean (name = "cs544")
    Course course1() {
        return new Course("EA", "544", 25, faculty1());
    }

    @Bean (name = "cs545")
    Course course2() {
        return new Course("WAA", "545", 20, faculty2());
    }

    @Bean (name = "jack")
    Student student1() {
        return new Student("Jack", 30);
    }

    @Bean (name = "john")
    Student student2() {
        return new Student("John", 28);
    }

    @Bean (name = "jill")
    Student student3() {
        return new Student("Jill", 35);
    }

    @Bean (name = "jim")
    Student student4() {
        return new Student("Jim", 25);
    }
}
