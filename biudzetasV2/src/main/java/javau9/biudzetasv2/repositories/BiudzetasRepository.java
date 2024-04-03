package javau9.biudzetasv2.repositories;

import javau9.biudzetasv2.models.Biudzetas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BiudzetasRepository extends JpaRepository<Biudzetas, Long> {
    @Query("SELECT SUM(b.suma) FROM Biudzetas b")
    Double getBiudzetoSuma();
}
