package com.example.borrow_book.repository;


import com.example.borrow_book.model.CodeBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICodeBookRepository extends JpaRepository<CodeBook, Integer> {

    CodeBook findByCodeBook(int codeBook);
}
