package com.ghibi.ecommerce.repository;

import com.ghibi.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order,Integer> {
}
