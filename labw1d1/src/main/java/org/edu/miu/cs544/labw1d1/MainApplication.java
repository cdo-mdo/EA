package org.edu.miu.cs544.labw1d1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainApplication {
    public static void main(String[] args) {
        Car car1 = new Car("VF8", "VINFAST", 2024, 200000);
        Car car2 = new Car("Camry", "TOYOTA", 2023, 100000);
        Car car3 = new Car("Civic", "HONDA", 2022, 150000);
        Car car4 = new Car("Ford Escape", "FORD", 2021, 200000);
        Car car5 = new Car("Chevrolet", "GENERAL MOTOR", 2020, 180000);
        Car car6 = new Car("X", "TESLA", 2024, 10000);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("labw1d1");
        EntityManager em = emf.createEntityManager();

        // Create
        em.getTransaction().begin();

        em.persist(car1);
        em.persist(car2);
        em.persist(car3);
        em.persist(car4);
        em.persist(car5);
        em.persist(car6);

        em.getTransaction().commit();

        // Read
        Car carFromDB1 = em.find(Car.class, car1.getId());
        Car carFromDB2 = em.find(Car.class, car2.getId());
        Car carFromDB3 = em.find(Car.class, car3.getId());
        Car carFromDB4 = em.find(Car.class, car4.getId());
        Car carFromDB5 = em.find(Car.class, car5.getId());
        Car carFromDB6 = em.find(Car.class, car6.getId());
        Car carFromDB7 = em.find(Car.class, car6.getId() + 1);
        System.out.println(carFromDB1);
        System.out.println(carFromDB2);
        System.out.println(carFromDB3);
        System.out.println(carFromDB4);
        System.out.println(carFromDB5);
        System.out.println(carFromDB6);
        System.out.println(carFromDB7);

        // Update
        car1.setMileage(0);
        Car merge = em.merge(car1);
        System.out.println(merge);

        em.getTransaction().begin();
        carFromDB1.setModel("VF3");
        System.out.println(carFromDB1);
        System.out.println(car1);
        em.getTransaction().commit();

        // Delete
        em.getTransaction().begin();
        em.remove(car2);
        em.remove(em.find(Car.class, car2.getId()));
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
