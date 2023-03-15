package com.example.ex1.service;

import com.example.ex1.model.BlogType;

import java.util.List;

public interface IBlogTypeService {
    List<BlogType> findByName(String name);

    void save(BlogType blogType);
}
