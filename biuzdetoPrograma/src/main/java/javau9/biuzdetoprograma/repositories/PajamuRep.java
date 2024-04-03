package javau9.biuzdetoprograma.repositories;

import javau9.biuzdetoprograma.models.Pajamos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PajamuRep extends JpaRepository<Pajamos, Long> {
}
