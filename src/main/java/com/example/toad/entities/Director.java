package com.example.toad.entities;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity // This tells Hibernate to make a table out of this class
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_director; // BIGINT
 
    private String nom;
 
    private String prenom;
 
    private java.sql.Timestamp date_naissance; // Year is typically handled as Integer
 
    private String nationalite; // TINYINT
 
    // Getters and Setters
    public Integer getid_director() {
        return id_director;
    }
 
    public void setid_director(Integer id_director) {
        this.id_director = id_director;
    }
 
    public String getnom() {
        return nom;
    }
 
    public void setnom(String nom) {
        this.nom = nom;
    }
 
    public String getprenom() {
        return prenom;
    }
 
    public void setprenom(String prenom) {
        this.prenom = prenom;
    }
 
    public java.sql.Timestamp  getdate_naissance() {
        return date_naissance;
    }
 
    public void setdate_naissance(java.sql.Timestamp  date_naissance) {
        this.date_naissance = date_naissance;
    }
 
    public String getnationalite() {
        return nationalite;
    }
 
    public void setnationalite(String nationalite) {
        this.nationalite = nationalite;
    }
 
}
 