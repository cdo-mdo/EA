package org.edu.miu.cs544.exercise_3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Department department1 = new Department("Engineering");
        Department department2 = new Department("Technology");

        Employee emp1 = new Employee(1, "Jack", department1);
        Employee emp2 = new Employee(2, "Jill", department1);
        Employee emp3 = new Employee(3, "Jim", department1);
        department1.getEmployees().add(emp1);
        department1.getEmployees().add(emp2);
        department1.getEmployees().add(emp3);

        Employee emp4 = new Employee(4, "Bob", department2);
        Employee emp5 = new Employee(5, "Bill", department2);
        Employee emp6 = new Employee(6, "Bin", department2);
        department2.getEmployees().add(emp4);
        department2.getEmployees().add(emp5);
        department2.getEmployees().add(emp6);

        em.getTransaction().begin();

        em.persist(department1);
        em.persist(department2);

        em.getTransaction().commit();


        em.close();
        emf.close();


    }
}
