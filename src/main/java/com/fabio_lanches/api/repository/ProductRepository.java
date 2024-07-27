package com.fabio_lanches.api.repository;

import com.fabio_lanches.api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
