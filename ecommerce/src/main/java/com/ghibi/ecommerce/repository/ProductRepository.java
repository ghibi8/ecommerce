package com.ghibi.ecommerce.repository;

import com.ghibi.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product,Integer> {
}
