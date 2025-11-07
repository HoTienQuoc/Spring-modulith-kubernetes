package com.springmodulith.demo.order;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> getOrderByOrderIdentifier(String orderIdentifier);
}
