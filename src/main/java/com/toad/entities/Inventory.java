package com.toad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.sql.Timestamp;

@Entity
public class Inventory {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "inventory_id")
  private Integer inventoryId;

  @Column(name = "film_id")
  private Integer filmId;

  @Column(name = "store_id")
  private Integer storeId;

  @Column(name = "last_update")
  private Timestamp lastUpdate;

  public Integer getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }

  public Integer getFilmId() {
    return filmId;
  }

  public void setFilmId(Integer filmId) {
    this.filmId = filmId;
  }

  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}