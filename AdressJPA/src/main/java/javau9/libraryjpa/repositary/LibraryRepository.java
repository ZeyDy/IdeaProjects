package javau9.libraryjpa.repositary;

import javau9.libraryjpa.modules.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
}
