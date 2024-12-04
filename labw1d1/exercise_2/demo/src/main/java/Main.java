import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Customer customer1 = new Customer("Jack");
        Customer customer2 = new Customer("Jill");
        Customer customer3 = new Customer("John");

        em.getTransaction().begin();

        em.persist(customer1);
        em.persist(customer2);
        em.persist(customer3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
