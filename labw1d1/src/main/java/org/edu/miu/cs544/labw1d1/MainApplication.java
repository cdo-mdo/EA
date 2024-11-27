package org.edu.miu.cs544.labw1d1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainApplication {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("labw1d1");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Car car = new Car("VF8", "VINFAST", 2024, 200000);
        em.persist(car);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
