package edu.miu.cs.cs544.najeeb.midterm;

import edu.miu.cs.cs544.najeeb.midterm.config.SpringConfig;
import edu.miu.cs.cs544.najeeb.midterm.entity.Address;
import edu.miu.cs.cs544.najeeb.midterm.entity.Course;
import edu.miu.cs.cs544.najeeb.midterm.entity.Faculty;
import edu.miu.cs.cs544.najeeb.midterm.entity.Student;
import edu.miu.cs.cs544.najeeb.midterm.service.CRUD_Service;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    private void findStudentsTakingCourse() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("midterm");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Student> criteria = builder.createQuery(Student.class);
        Root<Student> root = criteria.from(Student.class);
        criteria.from(Course.class);
        criteria.from(Faculty.class);
        criteria.from(Address.class);
        Predicate[] predicates = new Predicate[2];
        predicates[0] = builder.equal(root.get("student"), root.get("course").get("capacity"));
        predicates[1] = builder.equal(root.get("student"), root.get("address").get("state"));

        criteria.select(root);
        List<Student> students = em.createQuery(criteria).getResultList();
    }

    private void findStudentsTakingCourseWithFacultyInMiami() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("midterm");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery(
                "SELECT * FROM Student s JOIN Course c, Faculty f, Addresss a WHERE s.id in c.students and c.id = f.course_id and f.id = a.faculty_id and a.state = 'miami'");
        query.getResultList();

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Application Start.");
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // uncomment these two lines one at a time.
        DataPopulator.populate_database(context);

        GradeUpdater.ConcurrentOperations(context);

        System.out.println("Application End.");
    }
}