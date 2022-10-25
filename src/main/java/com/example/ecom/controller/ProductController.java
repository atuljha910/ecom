package com.example.ecom.controller;

import com.example.ecom.models.Products;
import com.example.ecom.repository.IPrductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    IPrductsRepo prductsRepo;

    @GetMapping(value = "/products")
    public List<Products>listAll()
    {
        List<Products> allProducts = prductsRepo.findAll();
        return allProducts;
    }

    @GetMapping(value = "")
    public String showHealth()
    {
        return "good";
    }
    @PostMapping(value = "/products")
    public void createProduct(Products p) {
        prductsRepo.save(p);
    }
}
