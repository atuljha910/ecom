package com.example.ecom.controller;

import com.example.ecom.models.Users;
import com.example.ecom.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    IUserRepo userRepo;

    @GetMapping(value = "/users")
    public List<Users> GetAllUsers()
    {
        return userRepo.findAll();
    }
    @GetMapping(value = "/users/{id}")
    public Optional<Users> GetAllUsers(@PathVariable Integer id)
    {
        return userRepo.findById(id);
    }

    @PostMapping(value = "/users")
    public void AddUser(@RequestBody Users user)
    {
        userRepo.save(user);
    }

    @DeleteMapping(value = "/users/{id}")
    public void DeleteUser(@PathVariable Integer id)
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(id);
        userRepo.deleteAllById(l);
    }
}
