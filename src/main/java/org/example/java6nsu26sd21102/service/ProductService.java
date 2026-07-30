package org.example.java6nsu26sd21102.service;

import org.example.java6nsu26sd21102.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(long id);

    Product add(Product product);

    Product update(Product product, long id);

    void delete(long id);
}
