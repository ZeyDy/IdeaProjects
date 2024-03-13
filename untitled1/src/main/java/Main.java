import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        saveEmployee();
    }

    private static void loadEmployee() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        employees.forEach(System.out::println);
        session.close();
        factory.close();
    }


    private static void saveEmployee() throws HibernateException {
        //1 - Sukuriama gamykla
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        // 2 - Atidarome sesija
        Session session = factory.openSession();
        // 3 - Atidaryti transactions
        session.beginTransaction();

        Address centras = new Address("Klaipedos g.", "Gargzdai", "Lietuva");
        session.persist(centras);

        session.persist(new Employee("Romas", "Romenko",centras));

        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
