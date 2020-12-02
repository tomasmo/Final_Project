package com.project.Final_Project.controlers;

import com.project.Final_Project.model.Products;
import com.project.Final_Project.services.ProductsService;
import com.project.Final_Project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductsService productsService;

    @GetMapping("/")
    public String products(Model model) {
        List<Products> products = productsService.getAllProducts();

        model.addAttribute("products", products);
        return "products";
    }
}