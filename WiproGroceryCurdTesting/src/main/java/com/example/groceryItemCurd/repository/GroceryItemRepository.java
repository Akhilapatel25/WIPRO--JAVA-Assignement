package com.example.groceryItemCurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.groceryItemCurd.entity.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
