package com.example.ex1.repository;

import com.example.ex1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findByTittleContaining(String tittle, Pageable pageable);

    Blog findById(int id);

}
