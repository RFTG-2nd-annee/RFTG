package com.example.toad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rental_id; // BIGINT

    private String rental_date;

    private Integer inventory_id;

    private Integer customer_id;

    private String return_date; // Year is typically handled as Integer

    private Integer staff_id; // TINYINT

    private String last_update;

    // Getters and Setters
    public Integer getRentalId() {
        return rental_id;
    }

    public void setRentalId(Integer rental_id) {
        this.rental_id = rental_id;
    }

    public String getRentalDate() {
        return rental_date;
    }

    public void setRentalDate(String rental_date) {
        this.rental_date = rental_date;
    }

    public Integer getInventoryId() {
        return inventory_id;
    }

    public void setInventoryId(Integer inventory_id) {
        this.inventory_id = inventory_id;
    }

    public Integer getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getReturnDate() {
        return return_date;
    }

    public void setReturnDate(String return_date) {
        this.return_date = return_date;
    }

    public Integer getStaffId() {
        return staff_id;
    }

    public void setStaffId(Integer staff_id) {
        this.staff_id = staff_id;
    }
    
    public String getLastUpdate() {
        return last_update;
    }

    public void setLastUpdate(String last_update) {
        this.last_update = last_update;
    }
}
