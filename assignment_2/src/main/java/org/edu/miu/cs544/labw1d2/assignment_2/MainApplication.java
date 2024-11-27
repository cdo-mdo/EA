package org.edu.miu.cs544.labw1d2.assignment_2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainApplication {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("assignment_2");
        EntityManager em = emf.createEntityManager();

        Car car = new Car();
        car.setMake("VinFast");
        car.setModel("VF8");

        Person person = new Person("James");
        Person person2 = new Person("John");

        car.setDriver(person);
        car.setOwner(person2);

        em.getTransaction().begin();

        em.persist(car);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
