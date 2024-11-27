package org.edu.miu.cs544.w1d2.assignment_1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainApplication {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("assignment_1");
        EntityManager em = emf.createEntityManager();

        Course cs544 = new Course("Enterprise Architecture", 50, "ML219", "cs544");
        Student student1 = new Student("Manh Cuong Do");
        Student student2 = new Student("Saeed Lotfi");
        Student student3 = new Student("Buyandelger Tsendsuren");
        Student student4 = new Student("Awais Waheed");

        cs544.addStudent(student1);
        cs544.addStudent(student2);
        cs544.addStudent(student3);
        cs544.addStudent(student4);

        em.getTransaction().begin();

        em.persist(cs544);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
