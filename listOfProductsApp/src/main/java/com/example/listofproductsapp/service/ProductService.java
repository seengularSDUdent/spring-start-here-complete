package com.example.listofproductsapp.service;

import com.example.listofproductsapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService(){
        this.products.add(new Product("Test Product 0", 100));
        this.products.add(new Product("Test Product 1", 250));
        this.products.add(new Product("Test Product 2", 300));

    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }
}
