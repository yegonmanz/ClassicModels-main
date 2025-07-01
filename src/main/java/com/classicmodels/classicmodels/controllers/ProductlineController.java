package com.classicmodels.classicmodels.controllers;

import com.classicmodels.classicmodels.entities.Productline;
import com.classicmodels.classicmodels.repository.ProductlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productlines")
public class ProductlineController {

    @Autowired
    private ProductlineRepository productlineRepository;

    @GetMapping
    public List<Productline> getAllProductlines() {
        return productlineRepository.findAll();
    }

    @GetMapping("/{id}")
    public Productline getProductlineById(@PathVariable String id) {
        return productlineRepository.findById(id).orElse(null);
    }
}