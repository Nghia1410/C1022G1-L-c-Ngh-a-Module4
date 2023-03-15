package com.example.ex1.service;

import com.example.ex1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(String tittle, Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void edit(Blog blog);

    void delete(int id);
}
