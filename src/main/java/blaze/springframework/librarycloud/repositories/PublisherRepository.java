package blaze.springframework.librarycloud.repositories;

import blaze.springframework.librarycloud.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
