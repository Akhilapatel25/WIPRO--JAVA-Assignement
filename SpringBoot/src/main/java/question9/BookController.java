package question9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookXYZ")
public class BookController {

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public List<Book> getBooks() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(101, "Java Tutorials", "Krishna"));
        list.add(new Book(102, "Spring Tutorials", "Mahesh"));
        list.add(new Book(103, "Angular Tutorials", "Shiva"));
        return list;
    }
}
