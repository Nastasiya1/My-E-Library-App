package ru.mypackage.elibraryapp.services;

import org.springframework.stereotype.Service;
import ru.mypackage.elibraryapp.model.Book;
import ru.mypackage.elibraryapp.repositories.BookRepository;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> showAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public List<Book> findBook(String value) {
        return bookRepository.findBook(value);
    }
}