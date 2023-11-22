package com.example.listofproductsapp.controller;

import com.example.listofproductsapp.model.Product;
import com.example.listofproductsapp.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/list")
    public String getList(Model page){
        List<Product> products = productService.findAll();
        page.addAttribute("products", products);
        return "list.html";
    }

    @PostMapping("/list")
    public String addProduct(@RequestParam String name, @RequestParam double price, Model page){

        Product product = new Product(name, price);

        productService.addProduct(product);

        List<Product> products = productService.findAll();
        page.addAttribute("products", products);

        return "list.html";
    }

}
