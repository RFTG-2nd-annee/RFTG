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

import com.example.toad.entities.Customer;
import com.example.toad.entities.Film;
public class CustomerController {
    

@PutMapping(path = "/update/{id}")
    public @ResponseBody String updateRepository(
            @PathVariable Integer id,
            @RequestParam Integer store_id,
            @RequestParam String prenom,
            @RequestParam String nom,
            @RequestParam String mail,
            @RequestParam Integer adresse_id,
            @RequestParam int active,
            @RequestParam java.sql.Timestamp create_update,
            @RequestParam java.sql.Timestamp last_update) {
        
      Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) {
            return "Film not found";
        }

        customer.setId(id);
        customer.setStore_Id(store_id);

        customer.setPrenom(prenom);
        customer.setNom(nom);
        customer.setMail(mail);
        customer.setAdresseId(adresse_id);
        customer.setActive(active);

        customerRepository.save(customer);
        return "Customer Updated";
    }
}
