package org.edu.miu.cs544.labw1d1.exercise_4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Customer customer1 = new Customer("jack", "Iowa");

        List<Order> orders1 = new ArrayList<Order>();
        Order order1 = new Order(1, customer1);
        Order order2 = new Order(2, customer1);
        Order order3 = new Order(3, customer1);
        orders1.add(order1);
        orders1.add(order2);
        orders1.add(order3);
        customer1.setOrders(orders1);

        em.getTransaction().begin();

        em.persist(customer1);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
