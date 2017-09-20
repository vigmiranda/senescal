package br.com.senescal.book.service;

import br.com.senescal.book.domain.Book;
import br.com.senescal.book.repository.BookRepository;
import br.com.senescal.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Optional<Book> getBooksById(Integer id){
        return bookRepository.findBooksById(id);
    }
}
