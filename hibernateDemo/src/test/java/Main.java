import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {

        //saveStudent();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Query<Student> query = session.createQuery("FROM Student", Student.class);
        List<Student> students = query.getResultList();
        students.forEach(System.out::println);
        session.close();
    }

    private static void saveStudent() throws HibernateException {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Student student = new Student(1, "Alice", 24);

        session.persist(student);
        session.getTransaction().commit();
        session.close();
    }
}
