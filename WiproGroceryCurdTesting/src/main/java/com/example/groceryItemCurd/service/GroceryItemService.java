package com.example.groceryItemCurd.service;

import java.util.List;

import com.example.groceryItemCurd.entity.GroceryItem;

public interface GroceryItemService {
    GroceryItem save(GroceryItem item);
    List<GroceryItem> findAll();
    GroceryItem findById(Long id);
    GroceryItem update(Long id, GroceryItem item);
    void delete(Long id);
}
