package com.example.borrow_book.service.impl;

import com.example.borrow_book.model.CodeBook;
import com.example.borrow_book.repository.ICodeBookRepository;
import com.example.borrow_book.service.ICodeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeBookService implements ICodeBookService {

    @Autowired
    private ICodeBookRepository codeBookRepository;

    @Override
    public CodeBook findByCodeBook(int codeBook) {
        return codeBookRepository.findByCodeBook(codeBook);
    }

    @Override
    public void removeCodeBook(int codeBook) {
        codeBookRepository.delete(findByCodeBook(codeBook));
    }
}
