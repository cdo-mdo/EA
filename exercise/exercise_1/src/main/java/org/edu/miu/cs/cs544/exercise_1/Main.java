package org.edu.miu.cs.cs544.exercise_1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("JPA implementation by EclipseLink");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Student student1 = new Student("Jack", 4.0);
        Student student2 = new Student("John", 3.8);
        Student student3 = new Student("Jane", 3.6);
        Student student4 = new Student("Jim", 3.4);
        Student student5 = new Student("Jill", 3.2);

        em.getTransaction().begin();

        em.persist(student1);
        em.persist(student2);
        em.persist(student3);
        em.persist(student4);
        em.persist(student5);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
