package com.springmodulith.demo.inventory;

import com.springmodulith.demo.inventory.exposed.InventoryDto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class InventoryUtil {
    public InventoryDto mapInventoryDto(Inventory inventory){
        return InventoryDto.builder()
            .id(inventory.getId())
            .name(inventory.getName())
            .description(inventory.getDescription())
            .price(inventory.getPrice())
            .build();
    }
}
