package edu.miu.cs.cs544.najeeb.midterm;

import edu.miu.cs.cs544.najeeb.midterm.entity.Student;
import edu.miu.cs.cs544.najeeb.midterm.service.CRUD_Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Application Start.");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // uncomment these two lines one at a time.
//        DataPopulator.populate_database(context);

//        GradeUpdater.ConcurrentOperations(context);

        System.out.println("Application End.");
    }
}