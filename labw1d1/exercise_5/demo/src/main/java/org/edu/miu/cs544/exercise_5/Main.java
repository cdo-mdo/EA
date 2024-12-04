package org.edu.miu.cs544.exercise_5;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercise_5");
        EntityManager em = emf.createEntityManager();

        Department department1 = new Department("Engineering");
        Department department2 = new Department("Sales");

        Employee emp1 = new Employee("Jack", department1);
        Employee emp2 = new Employee("John", department1);
        Employee emp3 = new Employee("Jane", department1);

        Employee emp4 = new Employee("Bill", department2);
        Employee emp5 = new Employee("Bob", department2);
        Employee emp6 = new Employee("Ben", department2);

        em.getTransaction().begin();

//        em.persist(department1);
//        em.persist(department2);

        em.persist(emp1);
        em.persist(emp2);
        em.persist(emp3);
        em.persist(emp4);
        em.persist(emp5);
        em.persist(emp6);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
