package blaze.springframework.librarycloud.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Publisher {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;

}
