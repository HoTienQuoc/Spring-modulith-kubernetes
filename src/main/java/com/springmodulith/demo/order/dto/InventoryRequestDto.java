package com.springmodulith.demo.order.dto;

public record InventoryRequestDto(
    String inventoryName,
    int qty
) {

}
