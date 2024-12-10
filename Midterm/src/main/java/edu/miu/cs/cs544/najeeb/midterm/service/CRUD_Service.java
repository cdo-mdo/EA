package edu.miu.cs.cs544.najeeb.midterm.service;

import edu.miu.cs.cs544.najeeb.midterm.entity.Course;
import edu.miu.cs.cs544.najeeb.midterm.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CRUD_Service implements AutoCloseable{
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tx;

    public CRUD_Service(String persistenceUnitName) {
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        em = emf.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    private void startTransaction() {

        tx = em.getTransaction();
        tx.begin();
    }

    private void endTransaction() {
        tx.commit();
    }

    public void create(Course course) {
        startTransaction();
        em.persist(course);
        endTransaction();
    }

    public Student read(int id) {
        startTransaction();
        Student student= em.find(Student.class, id);
        endTransaction();
        return student;
    }

    public Student update(Student student) {
        startTransaction();
        Student databaseStudent= em.merge(student);
        endTransaction();
        return databaseStudent;
    }

    public void delete(Student student) {
        startTransaction();
        em.remove(student);
        endTransaction();
    }

    @Override
    public void close() throws Exception {
        em.close();
        emf.close();
    }

}
