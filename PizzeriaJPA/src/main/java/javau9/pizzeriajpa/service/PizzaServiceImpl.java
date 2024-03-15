package javau9.pizzeriajpa.service;

import javau9.pizzeriajpa.modules.Pizza;
import javau9.pizzeriajpa.repositary.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    PizzaRepository pizzaRepository;
    @Autowired
    public PizzaServiceImpl(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
        seedDummyDate();
    }

    private void seedDummyDate(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Vulcano", "Large", 15.00));
        pizzas.add(new Pizza("Margherita", "Medium", 10.00));
        pizzas.add(new Pizza("Pepperoni", "Small", 5.00));
        pizzas.add(new Pizza("Hawaiian", "Large", 15.00));
        pizzas.add(new Pizza("BBQ Chicken", "Medium", 10.00));
        pizzas.add(new Pizza("Vegetarian", "Small", 5.00));
        pizzas.add(new Pizza("Meat Lovers", "Large", 15.00));
        pizzas.add(new Pizza("Four Cheese", "Medium", 10.00));
        pizzas.add(new Pizza("Mushroom Supreme", "Small", 5.00));
        pizzas.add(new Pizza("Mediterranean", "Large", 15.00));

        pizzaRepository.saveAll(pizzas);
    }

    @Override
    public Pizza addPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @Override
    public Pizza getPizzaById(Long id) {
        return pizzaRepository.findById(id).get();
    }

    @Override
    public void removePizza(Long id) {
        pizzaRepository.deleteById(id);
    }
}