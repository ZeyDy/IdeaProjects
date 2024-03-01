import entities.Student;

import java.util.ArrayList;
import java.util.List;
public class StudentManager extends CSVFileHandler {

    public StudentManager(String name, int amzius) {
        super(name, amzius);
    }

    @Override
    public void addStudent() {
        super.addStudent();
    }

    @Override
    public void studInfo() {
        super.studInfo();
    }

    public List<Student> ieskotiStudentoPagalVarda(String vardas) {
        List<Student> items = new ArrayList<>();
        for (Student studentas : items) {
            if (studentas.getName().equals(vardas)) {
                items.add(studentas);
            }
        }
        return items;
    }
}
