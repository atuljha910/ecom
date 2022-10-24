package com.example.ecom.repository;
import com.example.ecom.models.Products;

import java.util.*;

public interface IPrductsRepo {
    List<Products> get();
    Products get(int id);
    void save(Products product);
    void delete(int id);
}
