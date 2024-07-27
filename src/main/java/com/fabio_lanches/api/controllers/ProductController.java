package com.fabio_lanches.api.controllers;


import com.fabio_lanches.api.entities.Product;
import com.fabio_lanches.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }
}
