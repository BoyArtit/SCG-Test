package scg.test.book.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scg.test.book.management.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
