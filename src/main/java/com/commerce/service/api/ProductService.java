package com.commerce.service.api;

import com.commerce.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findByName(String name);
    Product findByIdProduct(int id);
    List<Product> findPriceBetween(int Price1, int Price2);
    public Product addProduct(Product product);
}
