import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

//        Customer customer1 = new Customer("Jack");
//        Customer customer2 = new Customer("Jill");
//        Customer customer3 = new Customer("John");
//
//        List<Order> orders1 = new ArrayList<Order>();
//        Order order1 = new Order(customer1.getId(), 1, 10);
//        Order order2 = new Order(customer1.getId(), 2, 20);
//        Order order3 = new Order(customer1.getId(), 3, 30);
//        orders1.add(order1);
//        orders1.add(order2);
//        orders1.add(order3);
//
//        List<Order> orders2 = new ArrayList<>();
//        Order order4 = new Order(customer2.getId(), 10, 100);
//        Order order5 = new Order(customer2.getId(), 20, 200);
//        Order order6 = new Order(customer2.getId(), 30, 300);
//        orders2.add(order4);
//        orders2.add(order5);
//        orders2.add(order6);
//
//        List<Order> orders3 = new ArrayList<>();
//        Order order7 = new Order(customer3.getId(), 100, 1000);
//        Order order8 = new Order(customer3.getId(), 200, 2000);
//        Order order9 = new Order(customer3.getId(), 300, 3000);
//        orders3.add(order7);
//        orders3.add(order8);
//        orders3.add(order9);
//
//        customer1.setOrders(orders1);
//        customer2.setOrders(orders2);
//        customer3.setOrders(orders3);

        em.getTransaction().begin();
        em.getTransaction().commit();

//        em.persist(customer1);
//        em.persist(customer2);
//        em.persist(customer3);

        em.close();
        emf.close();
    }
}
