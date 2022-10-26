package com.example.ecom.controller;

import com.example.ecom.models.Products;
import com.example.ecom.repository.IPrductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    @GetMapping(value = "/products/{id}")
    public Optional<Products> getProductDetails(@PathVariable Integer id)
    {
        Optional<Products> p = prductsRepo.findById(id);
        return p;
    }
    @GetMapping(value = "")
    public String showHealth()
    {
        return "good";
    }
    @PostMapping(value = "/products")
    public void createProduct(@RequestBody Products p) {
        prductsRepo.save(p);
    }

    @DeleteMapping(value = "/products/{id}")
    public void deleteProduct(@PathVariable Integer id)
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(id);
        prductsRepo.deleteAllById(l);
    }
}
