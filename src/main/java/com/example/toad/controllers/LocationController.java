package com.example.toad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.toad.entities.Location;
import com.example.toad.repositories.LocationRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/location") // This means URL's start with /film (after Application path)
public class LocationController {
    @Autowired
    private LocationRepository locationRepository; // Assuming you have a FilmRepository for Film entity
    
    @PutMapping(path = "/update/{id}") // Map ONLY PUT Requests for updating a film
    public @ResponseBody String updateLocation(
            @PathVariable Integer rental_id,
            @RequestParam String rental_date,
            @RequestParam Integer inventory_id,
            @RequestParam Integer customer_id,
            @RequestParam String return_date,
            @RequestParam Integer staff_id,
            @RequestParam String last_update) {

        Location location = locationRepository.findById(rental_id).orElse(null);
        if (location == null) {
            return "Location not found";
        }

        location.setRentalId(rental_id);
        location.setRentalDate(rental_date);
        location.setInventoryId(inventory_id);
        location.setCustomerId(customer_id);
        location.setReturnDate(return_date);
        location.setStaffId(staff_id);
        location.setLastUpdate(last_update);

        locationRepository.save(location);
        return "Location Updated";
    }

}
