package com.ghibi.ecommerce.repository;

import com.ghibi.ecommerce.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer> {

}
