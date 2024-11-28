package org.edu.miu.cs544.test1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import static jakarta.persistence.Persistence.createEntityManagerFactory;

public class MainApplication {
    public static void main(String[] args) {
        EntityManagerFactory emf = createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Student student = new Student("Manh Cuong Do", "Vietnam");

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
