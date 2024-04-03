package lt.javau9.biblioteka.repositories;

import lt.javau9.biblioteka.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
    Library findByName(String name);

}
