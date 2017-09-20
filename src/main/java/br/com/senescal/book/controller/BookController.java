package br.com.senescal.book.controller;

import br.com.senescal.book.domain.Book;
import br.com.senescal.book.exception.BookNotFoundException;
import br.com.senescal.book.projection.SimpleBook;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping(value = "/book")
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {


    private final ProjectionFactory projectionFactory = new SpelAwareProxyProjectionFactory();
    //private final BookService bookService;

    @RequestMapping(value = "/{id}", method= RequestMethod.GET)
    public SimpleBook getBookById (@PathVariable("id") Optional<Book> book) {

        return this.projectionFactory.createProjection(SimpleBook.class, book.orElseThrow(BookNotFoundException::new));
    }
}
