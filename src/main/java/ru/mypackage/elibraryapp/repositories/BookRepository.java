package ru.mypackage.elibraryapp.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import ru.mypackage.elibraryapp.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {
    @Query("SELECT * FROM book WHERE " +
            "LOWER (title) LIKE LOWER (CONCAT('%', :value, '%')) OR " +
            "LOWER (author) LIKE LOWER (CONCAT('%', :value, '%'))")
    List<Book> findBook(String value);
}