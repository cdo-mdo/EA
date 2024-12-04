package org.edu.miu.cs544.labw1d3.assignment_1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Course courseOC1 = CourseManager.createSTCCourse();
        Course courseOC2 = CourseManager.createFPPCourse();
        Course courseOC3 = CourseManager.createMPPCourse();
        Course courseOC4 = CourseManager.createAlgorithmCourse();
        Course courseOC5 = CourseManager.createEACourse();
        Course courseOC6 = CourseManager.createWAPCourse();
        Course courseOC7 = CourseManager.createIRCourse();
        Course courseOC8 = CourseManager.createWAACourse();
        Course courseOC9 = CourseManager.createCSCourse();
        Course courseOC10 = CourseManager.createDBMSCourse();

        Course courseDE1 = CourseManager.createSECourse();
        Course courseDE2 = CourseManager.createASDCourse();
        Course courseDE3 = CourseManager.createCCCourse();
        Course courseDE4 = CourseManager.createBDCourse();
        Course courseDE5 = CourseManager.createAdSDCourse();

        em.getTransaction().begin();

        em.persist(courseOC1);
        em.persist(courseOC2);
        em.persist(courseOC3);
        em.persist(courseOC4);
        em.persist(courseOC5);
        em.persist(courseOC6);
        em.persist(courseOC7);
        em.persist(courseOC8);
        em.persist(courseOC9);
        em.persist(courseOC10);

        em.persist(courseDE1);
        em.persist(courseDE2);
        em.persist(courseDE3);
        em.persist(courseDE4);
        em.persist(courseDE5);

        em.getTransaction().commit();

        Student student1 = new Student("Jack", 3.8F);
        List<Course> courseAttended = new ArrayList<Course>();
        courseAttended.add(em.find(Course.class, courseOC1.getId()));
        courseAttended.add(em.find(Course.class, courseOC2.getId()));
        courseAttended.add(em.find(Course.class, courseOC3.getId()));
        courseAttended.add(em.find(Course.class, courseOC4.getId()));
        courseAttended.add(em.find(Course.class, courseOC5.getId()));
        courseAttended.add(em.find(Course.class, courseOC6.getId()));
        courseAttended.add(em.find(Course.class, courseOC7.getId()));
        courseAttended.add(em.find(Course.class, courseOC8.getId()));
        courseAttended.add(em.find(Course.class, courseOC9.getId()));
        courseAttended.add(em.find(Course.class, courseOC10.getId()));
        student1.setCoursesAttended(courseAttended);

        student1.setCourseAttending(em.find(Course.class, courseOC4.getId()));

        Student student2 = new Student("Jim", 3.7F);
        List<Course> courseAttended2 = new ArrayList<Course>();
        courseAttended2.add(em.find(Course.class, courseOC1.getId()));
        courseAttended2.add(em.find(Course.class, courseOC2.getId()));
        courseAttended2.add(em.find(Course.class, courseOC3.getId()));
        courseAttended2.add(em.find(Course.class, courseOC4.getId()));
        courseAttended2.add(em.find(Course.class, courseOC5.getId()));
        courseAttended2.add(em.find(Course.class, courseOC6.getId()));
        courseAttended2.add(em.find(Course.class, courseOC7.getId()));
        courseAttended2.add(em.find(Course.class, courseOC8.getId()));
        courseAttended2.add(em.find(Course.class, courseOC9.getId()));
        courseAttended2.add(em.find(Course.class, courseOC10.getId()));

        student2.setCoursesAttended(courseAttended2);

//        student2.setCourseAttending(em.find(Course.class, courseDE2.getId()));

        Student student3 = new Student("Joe", 2.95F);

        student3.setCoursesAttended(courseAttended2);
        student3.setCourseAttending(courseOC5);


        em.getTransaction().begin();

        em.persist(student1);

        em.getTransaction().commit();

        em.getTransaction().begin();

        em.persist(student2);
        em.persist(student3);

        em.getTransaction().commit();

        System.out.println("Find student1 with GPA greater than 3.5 and attending course with capacity greater than 30");
        findStudentsWithPGAAndAttendCourseWithCapacity(em, 3.5F, 30);
        System.out.println("Find student1 can graduate");
        findStudentCanGraduate(em);
        System.out.println("Find student1 with GPA less than 3.0 and attending course of professor Najeeb");
        findStudentsWithGPAAndAttendCourseWithProfessor(em, 3.0F, "Najeeb Najeeb");

        em.close();
        emf.close();

    }

    private static void findStudentsWithPGAAndAttendCourseWithCapacity(EntityManager em, float gpa, int capacity) {
        String queryString = "SELECT s from Student s WHERE s.gpa > " + gpa + " AND s.courseAttending.capacity >= " + capacity;
        TypedQuery<Student> query = em.createQuery(queryString, Student.class);
        if (query.getResultList().size() > 0) {
            for (Student student : query.getResultList()) {
                System.out.println(student.getName() + " " + student.getGpa());
            }
        }
    }

    private static void findStudentCanGraduate(EntityManager em) {
        TypedQuery<Student> query = em.createNamedQuery("Student.canGraduate", Student.class);
        query.setParameter("gpa", 3.0F);
        query.setParameter("numCourseAttended", 9);
        if (query.getResultList().size() > 0) {
            for (Student student : query.getResultList()) {
                System.out.println(student.getName() + " " + student.getGpa());
            }
        }
    }

    private static void findStudentsWithGPAAndAttendCourseWithProfessor(EntityManager em, float gpa, String professor) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> rootStudent = cq.from(Student.class);
        cq.select(rootStudent);

        Predicate gpaPredicate = cb.lessThan(rootStudent.get("gpa"), gpa);

        Join<Student, Course> joinCourse;
        joinCourse = rootStudent.join("courseAttending");
        Predicate professorPredicate = cb.equal(joinCourse.get("professor"), professor);

        cq.where(gpaPredicate, professorPredicate);

        TypedQuery<Student> query = em.createQuery(cq);

        if (query.getResultList().size() > 0) {
            for (Student student : query.getResultList()) {
                System.out.println(student.getName() + " " + student.getGpa());
            }
        }

    }
}
