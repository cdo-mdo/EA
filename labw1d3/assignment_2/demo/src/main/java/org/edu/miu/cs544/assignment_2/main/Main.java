package org.edu.miu.cs544.assignment_2.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.edu.miu.cs544.assignment_2.user.PasswordUtil;
import org.edu.miu.cs544.assignment_2.user.User;

import java.time.LocalDateTime;

public class Main {
    private static int getNumberOfUser(EntityManager em) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> root = cq.from(User.class);
        cq.select(root);

        TypedQuery<User> query = em.createQuery(cq);
        return query.getResultList().size();
    }

    public static void main(String[] args) {
        User admin = new User("admin", PasswordUtil.hashPassword("admin"),
                "ADMIN", true, LocalDateTime.now(), LocalDateTime.now());
        User user1 = new User("jack", PasswordUtil.hashPassword("jack"),
                "USER", true, LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("jim", PasswordUtil.hashPassword("jim"),
                "USER", true, LocalDateTime.now(), LocalDateTime.now());
        User user3 = new User("jill", PasswordUtil.hashPassword("jill"),
                "USER", true, LocalDateTime.now(), LocalDateTime.now());
        User user4 = new User("joe", PasswordUtil.hashPassword("joe"),
                "USER", true, LocalDateTime.now(), LocalDateTime.now());
        User user5 = new User("jay", PasswordUtil.hashPassword("jay"),
                "USER", true, LocalDateTime.now(), LocalDateTime.now());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(admin);
        em.persist(user1);
        em.persist(user2);
        em.persist(user3);
        em.persist(user4);
        em.persist(user5);
        em.getTransaction().commit();

        System.out.println("Number of users: " + getNumberOfUser(em));

        em.close();
        emf.close();
    }
}
