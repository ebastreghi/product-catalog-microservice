package com.productcatalogmicroservice.controller;

import com.productcatalogmicroservice.model.Product;
import com.productcatalogmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Integer id){
        return productRepository.findById(id).get();
    }

}
