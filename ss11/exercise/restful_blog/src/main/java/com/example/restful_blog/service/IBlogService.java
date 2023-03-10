package com.example.restful_blog.service;

import com.example.restful_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void save(Blog blog);

    Page<Blog>findBlogByCategory_Id(int id,Pageable pageable);
}
