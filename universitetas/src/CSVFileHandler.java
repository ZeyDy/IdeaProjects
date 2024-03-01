import entities.Student;
import interfaces.Printable;
import interfaces.Startable;
import interfaces.UI;

import java.util.ArrayList;
import java.util.List;

public class CSVFileHandler extends Student {
    private ArrayList<Student> list = new ArrayList<>();

    public CSVFileHandler(String name, int amzius) {
        super(name, amzius);
    }
    public void addStudent() {
        list.add(new Student("Kostia",69));
    }

    public void studInfo() {
        for (Student student : list) {
            System.out.println("Vardas: " + student.getName() + ", Amzius: " + student.getAmzius());
        }
    }
}