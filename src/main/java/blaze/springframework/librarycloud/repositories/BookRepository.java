package blaze.springframework.librarycloud.repositories;

import blaze.springframework.librarycloud.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
