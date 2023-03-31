package blaze.springframework.librarycloud.repositories;

import blaze.springframework.librarycloud.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
