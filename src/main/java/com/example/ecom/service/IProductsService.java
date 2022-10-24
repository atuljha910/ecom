package com.example.ecom.service;

import com.example.ecom.models.Products;

import java.util.*;

public interface IProductsService {
    List<Products> get();
    Products get(int id);
    void save(Products product);
    void delete(int id);
}
