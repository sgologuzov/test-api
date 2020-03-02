package com.example.test.api.controller;

import com.example.test.api.model.Product;
import com.example.test.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/api/products")
    public Iterable<Product> getProducts() {
        return repository.findAll();
    }
}
