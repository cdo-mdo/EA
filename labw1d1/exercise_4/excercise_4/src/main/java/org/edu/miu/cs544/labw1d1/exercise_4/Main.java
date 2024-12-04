package org.edu.miu.cs544.labw1d1.exercise_4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercise_4");
        EntityManager em = emf.createEntityManager();

        Employee emp1 = new Employee("Jack");
        Employee emp2 = new Employee("John");
        Employee emp3 = new Employee("Jane");

        Cubicle cubicle1 = new Cubicle("A1", emp1);
        Cubicle cubicle2 = new Cubicle("A2", emp2);
        Cubicle cubicle3 = new Cubicle("A3", emp3);

        emp1.setAssignedCubicle(cubicle1);
        emp2.setAssignedCubicle(cubicle2);
        emp3.setAssignedCubicle(cubicle3);

        em.getTransaction().begin();

        em.persist(cubicle1);
        em.persist(cubicle2);
        em.persist(cubicle3);

        em.persist(emp1);
        em.persist(emp2);
        em.persist(emp3);



        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
