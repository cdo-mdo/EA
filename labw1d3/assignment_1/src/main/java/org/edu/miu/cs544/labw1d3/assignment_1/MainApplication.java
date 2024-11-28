package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        Course course1 = CourseManager.createSTCourse();
        Course course2 = CourseManager.createFPPCourse();
        Course course3 = CourseManager.createMPPCourse();
        Course course4 = CourseManager.createAlgorithmCourse();
        Course course5 = CourseManager.createEACourse();
        Course course6 = CourseManager.createWMACourse();

        Student student = new Student("Manh Cuong Do", 3.1F);
        List<Course> courseAttended = new ArrayList<Course>();
        courseAttended.add(course1);
        courseAttended.add(course2);
        courseAttended.add(course3);
        courseAttended.add(course4);
        courseAttended.add(course6);

        student.setCourseAttended(courseAttended);
        student.setCourseAttending(course5);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();

        findStudentsWithPGAAndAttendCourseWithCapacity(em, 2.5F, 30);

        em.close();
        emf.close();

    }

    private static void findStudentsWithPGAAndAttendCourseWithCapacity(EntityManager em, float gpa, int capacity) {
        String queryString = "SELECT s from Student s WHERE s.gpa > " + gpa + " AND s.courseAttending.capacity > " + capacity;
        TypedQuery<Student> query = em.createQuery(queryString, Student.class);
        if (query.getResultList().size() > 0) {
            for (Student student : query.getResultList()) {
                System.out.println(student.getName() + " " + student.getGpa());
            }
        }
    }
}
