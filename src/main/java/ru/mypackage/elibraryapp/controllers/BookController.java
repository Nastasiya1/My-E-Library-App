package ru.mypackage.elibraryapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mypackage.elibraryapp.model.Book;
import ru.mypackage.elibraryapp.services.BookServiceImpl;

import java.util.List;

@RestController
public class BookController {
    private final BookServiceImpl bookServiceImpl;

    public BookController(BookServiceImpl bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookServiceImpl.showAllBooks();
    }

    @GetMapping("/books/search")
    public List<Book> findBook(@RequestParam(required = false) String value) {
        if (value == null) {
            return bookServiceImpl.showAllBooks();
        } else {
            return bookServiceImpl.findBook(value);
        }
    }
}