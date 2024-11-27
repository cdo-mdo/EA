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
        Car car2 = new Car("Camry", "TOYOTA", 2024, 100000);
        Car car3 = new Car("Civic", "HONDA", 2024, 150000);
        Car car4 = new Car("Ford Escape", "FORD", 2024, 200000);
        Car car5 = new Car("Chevrolet", "GENERAL MOTOR", 2024, 180000);
        Car car6 = new Car("X", "TESLA", 2024, 10000);

        em.persist(car);
        em.persist(car2);
        em.persist(car3);
        em.persist(car4);
        em.persist(car5);
        em.persist(car6);
        em.getTransaction().commit();

        Car carFromDB = em.find(Car.class, car.getId());
        Car carFromDB2 = em.find(Car.class, car2.getId());
        Car carFromDB3 = em.find(Car.class, car3.getId());
        Car carFromDB4 = em.find(Car.class, car4.getId());
        Car carFromDB5 = em.find(Car.class, car5.getId());
        Car carFromDB6 = em.find(Car.class, car6.getId());
        Car carFromDB7 = em.find(Car.class, car6.getId() + 1);
        System.out.println(carFromDB);
        System.out.println(carFromDB2);
        System.out.println(carFromDB3);
        System.out.println(carFromDB4);
        System.out.println(carFromDB5);
        System.out.println(carFromDB6);
        System.out.println(carFromDB7);

        car.setMileage(0);
        Car merge = em.merge(car);
        System.out.println(merge);

        em.getTransaction().begin();
        carFromDB.setModel("VF3");
        System.out.println(carFromDB);
        System.out.println(car);
        em.getTransaction().commit();

        em.getTransaction().begin();
        em.remove(car2);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
