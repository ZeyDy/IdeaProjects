package lt.javau9.biblioteka.repositories;

import lt.javau9.biblioteka.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByLibraryId(Long libraryId);
}
