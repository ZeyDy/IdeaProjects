package javau9.pizzeriajpa.controllers;

import javau9.pizzeriajpa.modules.Pizza;
import javau9.pizzeriajpa.service.PizzaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/")
public class PizzaController {
    @Autowired
    PizzaServiceImpl pizzaService;

    @GetMapping("/pizzas")
    public Collection<Pizza> getALlPizzas () {
        return pizzaService.getAllPizzas();
    }
    @GetMapping("/pizzas/{id}")
    public Pizza getStudentById(@PathVariable Long id) {
        return pizzaService.getPizzaById(id);
    }
    @PostMapping("/pizzas/add")
    public ResponseEntity<Pizza> createPizza(@RequestBody Pizza pizza ) {
        Pizza savedPizza = pizzaService.addPizza(pizza);
        return ResponseEntity.ok(savedPizza);
    }
}
