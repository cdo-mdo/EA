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

        Customer customer1 = new Customer("jack", "Iowa");
        Customer customer2 = new Customer("jane", "Minnesota");
        Customer customer3 = new Customer("john", "Colorado");

        List<Order> orders1 = new ArrayList<>();
        Order order1 = new Order(10);
        Order order2 = new Order(20);
        Order order3 = new Order(30);
        orders1.add(order1);
        orders1.add(order2);
        orders1.add(order3);
        customer1.setOrders(orders1);

        List<Order> orders2 = new ArrayList<>();
        Order order4 = new Order(100);
        Order order5 = new Order(200);
        Order order6 = new Order(300);
        orders2.add(order4);
        orders2.add(order5);
        orders2.add(order6);
        customer2.setOrders(orders2);

        List<Order> orders3 = new ArrayList<>();
        Order order7 = new Order(1000);
        Order order8 = new Order(2000);
        Order order9 = new Order(3000);
        orders3.add(order7);
        orders3.add(order8);
        orders3.add(order9);
        customer3.setOrders(orders3);

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.persist(customer1);
        em.persist(customer2);
        em.persist(customer3);

        em.close();
        emf.close();


    }
}
