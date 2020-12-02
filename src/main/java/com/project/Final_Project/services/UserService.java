package com.project.Final_Project.services;

import com.project.Final_Project.model.Users;
import com.project.Final_Project.repositories.OrderRepository;
import com.project.Final_Project.repositories.ProductsRepository;
import com.project.Final_Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductsRepository productsRepository;


    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }


}
