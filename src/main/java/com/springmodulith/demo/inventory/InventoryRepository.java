package com.springmodulith.demo.inventory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> getInventoryByName(String name);

    List<Inventory> getInventoryByNameIn(List<String> names);
}
