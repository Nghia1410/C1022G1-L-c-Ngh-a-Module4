package com.example.borrow_book.service.impl;

import com.example.borrow_book.model.Book;
import com.example.borrow_book.model.CodeBook;
import com.example.borrow_book.repository.IBookRepository;
import com.example.borrow_book.repository.ICodeBookRepository;
import com.example.borrow_book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private ICodeBookRepository codeBookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.getReferenceById(id);
    }

    @Override
    public int borrowBook(int id) {
        findById(id).setQuantity(findById(id).getQuantity() - 1);
        int code = (int) Math.floor(((Math.random() * 89999) + 10000));
        CodeBook codeBook = new CodeBook();
        codeBook.setCodeBook(code);
        codeBook.setBook(findById(id));
        findById(id).getCodeBookList().add(codeBook);
        codeBookRepository.save(codeBook);
        return code;
    }

    @Override
    public Book payBook(int codeBook) {
        return bookRepository.payBook(codeBook);
    }

    @Override
    public void payBookConfirm(int id) {
        findById(id).setQuantity(findById(id).getQuantity() + 1);

    }
}
