package javau9.controllers;

import ch.qos.logback.core.model.Model;
import jakarta.validation.Valid;
import javau9.modules.Car;
import javau9.repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    CarRepository carRepository;

    @PostMapping("/addcar")
    public String addCar(@Valid Car car, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-car";
        }
        carRepository.save(car);
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users", carRepository.findAll());
        return "index";
    }
}
