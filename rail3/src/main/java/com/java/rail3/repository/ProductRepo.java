package com.java.rail3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.java.rail3.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    // You can add custom query methods here if needed
}