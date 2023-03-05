package com.example.ex1.service.impl;

import com.example.ex1.model.BlogType;
import com.example.ex1.repository.IBlogTypeRepository;
import com.example.ex1.service.IBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeService implements IBlogTypeService {
    @Autowired
    IBlogTypeRepository iBlogTypeRepository;

    @Override
    public List<BlogType> findAll() {
        return iBlogTypeRepository.findAll();
    }
}