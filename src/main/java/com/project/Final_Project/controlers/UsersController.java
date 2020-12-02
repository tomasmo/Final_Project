package com.project.Final_Project.controlers;

import com.project.Final_Project.model.Users;
import com.project.Final_Project.repositories.UserRepository;
import com.project.Final_Project.services.ProductsService;
import com.project.Final_Project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductsService productService;

    @GetMapping("/")
    public String users(Model model) {
        List<Users> users = userService.getAllUsers();

        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/signup")
    public String showSignUpForm(Users users) {
        return "user-add";
    }

    @PostMapping("/adduser")
    public String addUser(Users users, BindingResult result, Model model){
        userRepository.save(users);
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Users users = userRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Invalid user id: " + id));

        userRepository.delete(users);
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }



















}