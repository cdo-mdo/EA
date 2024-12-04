package org.edu.miu.cs544.exercise_5;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercise_6");
        EntityManager em = emf.createEntityManager();

        Project project1 = new Project("rose");
        Project project2 = new Project("ajisai");
        Collection<Project> projects = Arrays.asList(project1, project2);

        Employee emp1 = new Employee("Jack", projects);
        Employee emp2 = new Employee("John", projects);
        Employee emp3 = new Employee("Jane", projects);
        Collection<Employee> employees = Arrays.asList(emp1, emp2, emp3);

        project1.setEmployees(employees);
        project2.setEmployees(employees);

        em.getTransaction().begin();

        em.persist(project1);
        em.persist(project2);

        em.persist(emp1);
        em.persist(emp2);
        em.persist(emp3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
