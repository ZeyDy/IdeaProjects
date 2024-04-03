package javau9.biuzdetoprograma.repositories;

import javau9.biuzdetoprograma.models.Islaidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IslaiduRep extends JpaRepository<Islaidos, Long> {
}
