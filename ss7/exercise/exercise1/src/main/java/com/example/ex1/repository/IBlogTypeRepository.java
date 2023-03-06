package com.example.ex1.repository;

import com.example.ex1.model.BlogType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogTypeRepository extends JpaRepository<BlogType,Integer> {
    List<BlogType> findAll();
}
