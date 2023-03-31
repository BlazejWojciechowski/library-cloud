package blaze.springframework.librarycloud.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor
public class Author {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<Book> books;
}
