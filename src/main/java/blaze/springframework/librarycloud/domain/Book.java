package blaze.springframework.librarycloud.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor
public class Book {
    private Long id;
    private String title;
    private String isbn;
    private Set<Author> authors;
}
