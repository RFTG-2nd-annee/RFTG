package com.example.toad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.toad.entities.Inventory;
import com.example.toad.repositories.InventoryRepository;

@Controller
@RequestMapping(path = "/inventory")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewInventory(
            @RequestParam Integer inventory_id,
            @RequestParam Integer film_id,
            @RequestParam Integer store_id,
            @RequestParam java.sql.Timestamp last_update) {
        
        Inventory inventory = new Inventory();
        inventory.setInventoryId(inventory_id);
        inventory.setFilmId(film_id);
        inventory.setStoreId(store_id);
        inventory.setLastUpdate(last_update);

        inventoryRepository.save(inventory);
        return "Inventaire Sauvegardé";
    }

    @GetMapping(path="/getById")
    public @ResponseBody Inventory getInventoryById(@RequestParam Integer id) {
      return inventoryRepository.findById(id).orElse(null);
    }
    
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Inventory> getAllInventories() {
        return inventoryRepository.findAll();
    }

    @PutMapping(path = "/update/{id}")
    public @ResponseBody String updateInventory(
            @PathVariable Integer id,
            @RequestParam Integer film_id,
            @RequestParam Integer store_id,
            @RequestParam java.sql.Timestamp last_update) {
        
        Inventory inventory = inventoryRepository.findById(id).orElse(null);
        if (inventory == null) {
            return "Inventaire non trouvé";
        }

        inventory.setFilmId(film_id);
        inventory.setStoreId(store_id);
        inventory.setLastUpdate(last_update);

        inventoryRepository.save(inventory);
        return "Inventaire Mis à Jour";
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteInventory(@PathVariable Integer id) {
        inventoryRepository.deleteById(id);
        return "Inventaire Supprimé";
    }
}
