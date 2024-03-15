package javau9.pizzeriajpa.repositary;

import javau9.pizzeriajpa.modules.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}
