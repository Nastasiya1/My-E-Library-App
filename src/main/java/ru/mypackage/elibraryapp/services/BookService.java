package ru.mypackage.elibraryapp.services;

import ru.mypackage.elibraryapp.model.Book;

import java.util.List;

public interface BookService {
    List<Book> showAllBooks();

    List<Book> findBook(String value);
}