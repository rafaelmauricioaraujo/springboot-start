package com.example.demo.controllers;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")

public class MainController {

    @Autowired

    private ProductRepository productRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewProduct(@RequestParam Product product){
        productRepository.save(product);
        return "Product adicionado";
    }

    @GetMapping(path="/all")
    public @ResponseBody String getAllProduct(){
        return productRepository.toString();
    }

}