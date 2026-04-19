package com.ecommerce.frontend.controller;

import com.ecommerce.frontend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", service.getAllProducts());
        return "products";
    }
}