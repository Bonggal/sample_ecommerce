package com.commerce.repository;

import com.commerce.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    ArrayList<Product> findAll();
    Product findByName(String name);
    Product findByIdproduct(int id);
    ArrayList<Product> findByPriceBetween(int Price1, int Price2);
}
