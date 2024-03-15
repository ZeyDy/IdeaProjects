package javau9.ca.hello.bootDemo.controllers;

import javau9.ca.hello.bootDemo.models.StudentDTO;
import javau9.ca.hello.bootDemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
   public StudentDTO getStudent() {
        return studentService.getStudentDto();
   }
    @GetMapping("/students")
   public List<StudentDTO> getALlStudents () {
        return  studentService.getStudents();
   }
    @GetMapping("/student/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);

    }
}

