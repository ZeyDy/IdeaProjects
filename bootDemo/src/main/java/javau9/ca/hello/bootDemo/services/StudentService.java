package javau9.ca.hello.bootDemo.services;

import javau9.ca.hello.bootDemo.models.StudentDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<StudentDTO> students;

    public StudentDTO getStudentDto() {
        return new StudentDTO("Alice","Cooper", null);
    }

    public List<StudentDTO> getStudents() {

        students.add(new StudentDTO("Alice", "Cooper",1l));
        students.add(new StudentDTO("Bob", "Smith", null));
        return students;
    }

    public StudentDTO getStudentById(@PathVariable Long id) {
        return this.students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
