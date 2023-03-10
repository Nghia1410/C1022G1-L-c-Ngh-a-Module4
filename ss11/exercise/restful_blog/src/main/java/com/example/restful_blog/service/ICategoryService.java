package com.example.restful_blog.service;

import com.example.restful_blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
