package com.example.borrow_book.service;


import com.example.borrow_book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findById(int id);

    int borrowBook(int id);

    Book payBook(int codeBook);

    void payBookConfirm(int id);
}
