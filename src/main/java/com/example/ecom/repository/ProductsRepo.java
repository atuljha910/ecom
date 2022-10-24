package com.example.ecom.repository;
import com.example.ecom.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.*;

@Repository
public class ProductsRepo implements IPrductsRepo {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Products> get() {
        return null;
    }

    @Override
    public Products get(int id) {
        return null;
    }

    @Override
    public void save(Products product) {

    }

    @Override
    public void delete(int id) {

    }
}
