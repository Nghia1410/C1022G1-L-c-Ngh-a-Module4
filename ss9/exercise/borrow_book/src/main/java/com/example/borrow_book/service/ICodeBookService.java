package com.example.borrow_book.service;


import com.example.borrow_book.model.CodeBook;

public interface ICodeBookService {

    void removeCodeBook(int codeBook);

    CodeBook findByCodeBook(int codeBook);
}
