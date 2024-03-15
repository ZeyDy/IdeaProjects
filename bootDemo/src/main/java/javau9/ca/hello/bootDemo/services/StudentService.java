package javau9.ca.hello.bootDemo.services;

import javau9.ca.hello.bootDemo.models.StudentDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<StudentDTO> students;

    public StudentService() {
        this.students = new ArrayList<>();
        students.add(new StudentDTO("Alice", "Cooper", 1L));
        students.add(new StudentDTO("Bob", "Smith", 2L));
    }

    public StudentDTO getStudentDto() {
        return new StudentDTO("Alice", "Cooper", 1L);
    }

    public List<StudentDTO> getStudents() {
        return students;
    }

    public StudentDTO getStudentById(Long id) {
        for (StudentDTO student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
