import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Student student1 = new Student("Jack");
        Student student2 = new Student("Jim");
        Student student3 = new Student("Jill");

        em.getTransaction().begin();

        em.persist(student1);
        em.persist(student2);
        em.persist(student3);

        em.getTransaction().commit();

        em.close();
        emf.close();


    }
}
