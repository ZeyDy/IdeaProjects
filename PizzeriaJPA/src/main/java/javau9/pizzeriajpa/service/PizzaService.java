package javau9.pizzeriajpa.service;

import javau9.pizzeriajpa.modules.Pizza;

import java.util.List;

public interface PizzaService {
    Pizza addPizza(Pizza pizza);
    Pizza getPizzaById(Long id);
    List<Pizza> getAllPizzas();
    void removePizza(Long id);
}
