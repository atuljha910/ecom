package com.example.ecom.service;

import com.example.ecom.models.Products;
import com.example.ecom.repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductsService implements IProductsService{
    @Autowired
    ProductsRepo productsRepo;

    @Transactional
    @Override
    public List<Products> get() {
        return null;
    }
    @Transactional
    @Override
    public Products get(int id) {
        return null;
    }
    @Transactional
    @Override
    public void save(Products product) {

    }
    @Transactional
    @Override
    public void delete(int id) {

    }
}
