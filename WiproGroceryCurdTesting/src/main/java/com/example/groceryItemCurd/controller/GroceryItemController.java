package com.example.groceryItemCurd.controller;

import com.example.groceryItemCurd.entity.GroceryItem;
import com.example.groceryItemCurd.service.GroceryItemService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grocery")
public class GroceryItemController {

    @Autowired
    private GroceryItemService service;

    @PostMapping
    public GroceryItem addItem(@Valid @RequestBody GroceryItem item) {
        return service.save(item);
    }

    @GetMapping
    public List<GroceryItem> getAllItems() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public GroceryItem getItem(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public GroceryItem updateItem(@PathVariable Long id, @Valid @RequestBody GroceryItem item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.delete(id);
    }
}
