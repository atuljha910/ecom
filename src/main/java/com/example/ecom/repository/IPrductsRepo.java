package com.example.ecom.repository;
import com.example.ecom.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPrductsRepo extends JpaRepository<Products, Integer> {

}
