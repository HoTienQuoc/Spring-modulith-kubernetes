package com.springmodulith.demo.inventory.exposed;




public record InventoryDto(
    Long id, String name, String description, long price
){
}
