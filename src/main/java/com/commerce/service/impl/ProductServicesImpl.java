package com.commerce.service.impl;

import com.commerce.entity.Product;
import com.commerce.repository.ProductRepository;
import com.commerce.service.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServicesImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product findByIdProduct(int id) {
        return productRepository.findByIdproduct(id);
    }

    @Override
    public List<Product> findPriceBetween(int Price1, int Price2) {
        return productRepository.findByPriceBetween(Price1, Price2);
    }

    @Override
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
}
