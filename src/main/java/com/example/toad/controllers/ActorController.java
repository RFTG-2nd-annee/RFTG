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

import com.example.toad.entities.Actor;
import com.example.toad.repositories.ActorRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/toad/actor") // This means URL's start with /film (after Application path)
public class ActorController {
    @Autowired
    private ActorRepository ActorRepository; // Assuming you have a FilmRepository for Film entity
    
    @PostMapping(path = "/actor")
    public @ResponseBody String createRental(
            @PathVariable Integer actor_id,
            @RequestParam String first_name ,
            @RequestParam String last_name,
            @RequestParam java.sql.Timestamp last_update){

                Actor newActor = new Actor();
                newActor.setActor_id(actor_id);
                newActor.setFirst_name(first_name);
                newActor.setLast_name(last_name);
                newActor.setLast_update(last_update);

                ActorRepository.save(newActor);
            
                return "Acteur enregistré avec succès !";
            }
    @GetMapping(path="/getById")
    public @ResponseBody Actor getActorById(@RequestParam Integer id) {
      return ActorRepository.findById(id).orElse(null);
    }
   
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Actor> getAllActors() {
        return ActorRepository.findAll();
    }
 
    @PutMapping(path = "/update/{actor_id}")
    public @ResponseBody String updateActor(
            @PathVariable Integer id,
            @RequestParam String first_name,
            @RequestParam String last_name,
            @RequestParam java.sql.Timestamp last_update) {
       
        Actor actor = ActorRepository.findById(id).orElse(null);
        if (actor == null) {
            return "Acteur non trouvé";
        }
 
        actor.setFirst_name(first_name);
        actor.setLast_name(last_name);
        actor.setLast_update(last_update);
 
        ActorRepository.save(actor);
        return "Acteur Mis à jour";
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteFilm(@PathVariable Integer id) {
        ActorRepository.deleteById(id);
        return "Acteur Supprimé";
    }
}
