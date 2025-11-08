package com.springmodulith.demo.order;

import org.springframework.stereotype.Service;

import com.springmodulith.demo.inventory.exposed.InventoryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {
    private final InventoryService inventoryService;

    public OrderDto createOrder(){
        inventoryService.fetchAllInName(null);
    }
}
