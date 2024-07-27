package com.fabio_lanches.api.services;

import com.fabio_lanches.api.entities.Product;
import com.fabio_lanches.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void addProduct(Product product) {
        repository.save(product);
    }

    public Product getById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
