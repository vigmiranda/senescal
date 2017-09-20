package br.com.senescal.book.repository;

import br.com.senescal.book.domain.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {

    Optional<Book> findBooksById(Integer id);

}
