package com.commerce.controller;

import com.commerce.entity.Product;
import com.commerce.service.impl.ProductServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductServicesImpl productServices;

    @Autowired
    public ProductController(ProductServicesImpl productServices){
        this.productServices = productServices;
    }

    @GetMapping(value="/all", produces = "application/json")
    public List<Product> getAllProduct(){
        return productServices.findAll();
    }

    @GetMapping(value = "/name", produces = "application/json")
    public Product getProduct(String name){
        return productServices.findByName(name);
    }

    @GetMapping(value = "/between", produces = "application/json")
    public List<Product> getBetween(int price1, int price2){
        return productServices.findPriceBetween(price1,price2);
    }

    @PostMapping(value = "/add", produces = "application/json")
    public Product addProduct(@RequestBody Product product){
        return productServices.addProduct(product);
    }
}
