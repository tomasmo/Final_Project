package com.project.Final_Project.services;


import com.project.Final_Project.model.Products;
import com.project.Final_Project.model.Users;
import com.project.Final_Project.repositories.ProductsRepository;
import com.project.Final_Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getAllProducts() {
        return (List<Products>) productsRepository.findAll();
    }
}
