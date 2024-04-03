package javau9.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class HomeControler {
    @GetMapping("/index")
    public String getHomeTampleta(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L, "Alice", "Cooper"));
        list.add(new Student(2L, "Bob", "Dylan"));
        list.add(new Student(3L, "Clare", "Domingo"));

        model.addAttribute("students", list);

        return "index";
    }
}
