import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBaseUtil {
    static final String url = "jdbc:mysql://localhost:3306/university";
    static final String user = "root";
    static final String password = "Ananasas.1";
    static Scanner sc = new Scanner(System.in);

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        String name = sc.nextLine();

        String query = "SELECT id, name, age FROM students";
        String query2 = "SELECT id, name, age FROM students WHERE name = '" + name + "'";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query);
        ) {

            while (rs.next()) {

                int id = rs.getInt("id");
                String studentName = rs.getString("name");
                int age = rs.getInt("age");
                Student stud = new Student(id, studentName, age);
                students.add(stud);
            }

            return students;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();


    }


    public static List<Student> getStudentsByName(String name) {
        List<Student> students = new ArrayList<>();

        //Su PreparedStatement
        //keiciasi uzklausa
        //klaustukas ? dedasi kaip pozicija i kuria galime ideti reiksme
        String query = "SELECT id, name, age FROM students WHERE name = ?";//keiciasi uzklausa
        System.out.println("SQL užklausa: " + query);
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, name); // Parametrų indeksai prasideda nuo 1
            //cia klaustuko pozicija, name - paduodama reiksme
            //tokiu budu apsaugota uzklausa galime paleisti i DB serveri

            ResultSet rs = statement.executeQuery(); // Naudokite executeQuery() be parametrų

            while (rs.next()) {
                int id = rs.getInt("id");
                String studentName = rs.getString("name");
                int age = rs.getInt("age");
                Student stud = new Student(id, studentName, age);
                students.add(stud);
            }

            return students;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }
}

