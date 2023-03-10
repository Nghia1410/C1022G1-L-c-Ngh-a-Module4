package com.example.ex1.service;

import com.example.ex1.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll(String tittle);

    Blog findById(int id);

    void save(Blog blog);

    void edit(Blog blog);

    void delete(int id);
}
