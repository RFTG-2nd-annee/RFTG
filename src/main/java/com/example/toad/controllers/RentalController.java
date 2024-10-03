package com.example.toad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.toad.entities.Rental;
import com.example.toad.repositories.RentalRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/Rental") // This means URL's start with /film (after Application path)
public class RentalController {
    @Autowired
    private RentalRepository RentalRepository; // Assuming you have a FilmRepository for Film entity
    
    @PutMapping(path = "/update/{id}") // Map ONLY PUT Requests for updating a film
    public @ResponseBody String updateRental(
            @PathVariable Integer rental_id,
            @RequestParam String rental_date,
            @RequestParam Integer inventory_id,
            @RequestParam Integer customer_id,
            @RequestParam String return_date,
            @RequestParam Integer staff_id,
            @RequestParam String last_update) {

        Rental Rental = RentalRepository.findById(rental_id).orElse(null);
        if (Rental == null) {
            return "Rental not found";
        }

        Rental.setRentalId(rental_id);
        Rental.setRentalDate(rental_date);
        Rental.setInventoryId(inventory_id);
        Rental.setCustomerId(customer_id);
        Rental.setReturnDate(return_date);
        Rental.setStaffId(staff_id);
        Rental.setLastUpdate(last_update);

        RentalRepository.save(Rental);
        return "Rental Saved";
    }

    @DeleteMapping(path = "/delete/{id}") // Map ONLY DELETE Requests for deleting a rental
    public @ResponseBody String deleteRental(@PathVariable Integer id) {
        RentalRepository.deleteById(id);
        return "Rental Deleted";
    }

    @PostMapping(path = "/create/{id}")
    public @ResponseBody String createRental(
            @PathVariable Integer rental_id,
            @RequestParam String rental_date,
            @RequestParam Integer inventory_id,
            @RequestParam Integer customer_id,
            @RequestParam String return_date,
            @RequestParam Integer staff_id,
            @RequestParam String last_update){

                Rental newRental = new Rental();
                newRental.setRentalDate(rental_date);
                newRental.setInventoryId(inventory_id);
                newRental.setCustomerId(customer_id);
                newRental.setReturnDate(return_date);
                newRental.setStaffId(staff_id);
                newRental.setLastUpdate(last_update);
            
                RentalRepository.save(newRental);
            
                return "Location crée avec succès !";
            }


}