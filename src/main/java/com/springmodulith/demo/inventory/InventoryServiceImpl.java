package com.springmodulith.demo.inventory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmodulith.demo.inventory.exposed.InventoryDto;
import com.springmodulith.demo.inventory.exposed.InventoryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;

    @Override
    public InventoryDto fetchInventoryByName(String name) {
        return inventoryRepository.getInventoryByName(name)
            .map(InventoryUtil::mapInventoryDto)
            .orElseThrow(()->new IllegalArgumentException("Could not find inventory by name: "+name));
    }

    @Override
    public List<InventoryDto> fetchAllInName(List<String> inventoryNames) {
        return inventoryRepository.getInventoryByNameIn(inventoryNames)
            .stream()
            .map(InventoryUtil::mapInventoryDto)
            .toList();
    }

}
