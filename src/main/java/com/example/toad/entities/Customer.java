package com.example.toad.entities;
 
import java.sql.Date;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity // This tells Hibernate to make a table out of this class
public class Customer {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column (name="customer_id")
  private Integer id;
  @Column (name="store_id")
  private Integer store_id;
  @Column (name="first_name")
  private String prenom;
  @Column (name="last_name")
  private String nom;
  @Column (name="email")
  private String mail;
  @Column (name="address_id")
  private Integer adresse_id;
  @Column (name="active")
  private int active;
  @Column (name="create_update")
  private Date create_update;
  @Column (name="last_update")
  private Date last_update;
 
  public void setId(Integer id) {
    this.id = id;
  }
 
  public Integer getId() {
    return id;
  }
 
  public void setStore_Id(Integer store_id) {
    this.store_id = store_id;
  }
 
  public Integer getStore_Id() {
    return store_id;
  }
 
  public void setNom(String nom) {
    this.nom = nom;
  }
 
  public String getNom() {
    return nom;
  }
 
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
 
  public String getPrenom() {
    return prenom;
  }
 
  public void setAdresseId(Integer adresse_id) {
    this.adresse_id = adresse_id;
  }
 
  public Integer getAdresseId() {
    return adresse_id;
  }
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }
  public int getActive() {
    return active;
  }
  public void setActive(int active) {
    this.active = active;
  }
  public Date getCreateUpdate() {
    return create_update;
  }
  public void setCreateUpdate(Date create_update) {
    this.create_update = create_update;
  }
  public Date getLastUpdate() {
    return last_update;
  }
  public void setLastUpdate(Date last_update) {
    this.last_update = last_update;
  }
}