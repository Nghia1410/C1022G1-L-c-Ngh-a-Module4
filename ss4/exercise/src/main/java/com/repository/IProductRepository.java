package com.repository;

import com.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findALl(String name);

    Product findById(int id);

    void save(Product product);

    void edit(Product product);

    void delete(int id);
}
