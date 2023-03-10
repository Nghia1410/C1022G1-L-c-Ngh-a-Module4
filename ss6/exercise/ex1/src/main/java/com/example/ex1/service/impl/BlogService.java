package com.example.ex1.service.impl;

import com.example.ex1.model.Blog;
import com.example.ex1.repository.IBlogRepository;
import com.example.ex1.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAll(String tittle) {
        if(tittle==null){
            tittle="";
        }
        return iBlogRepository.findByTittleContaining(tittle);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void edit(Blog blog) {
        iBlogRepository.save(blog);
    }
    @Override
    public void delete(int id) {
        iBlogRepository.delete(findById(id));
    }
}

