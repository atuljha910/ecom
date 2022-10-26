package com.example.ecom.repository;

import com.example.ecom.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<Users, Integer> {
}
