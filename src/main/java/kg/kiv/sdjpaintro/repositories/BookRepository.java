package kg.kiv.sdjpaintro.repositories;

import kg.kiv.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
