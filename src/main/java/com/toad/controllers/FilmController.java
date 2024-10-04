package com.toad.controllers;

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

import com.toad.entities.Film;
import com.toad.repositories.FilmRepository;

@Controller
@RequestMapping(path = "/toad/film")
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewFilm(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam Integer releaseYear,
            @RequestParam Byte languageId,
            @RequestParam Byte originalLanguageId,
            @RequestParam Byte rentalDuration,
            @RequestParam Double rentalRate,
            @RequestParam Integer length,
            @RequestParam Double replacementCost,
            @RequestParam String rating,
            @RequestParam java.sql.Timestamp lastUpdate,
            @RequestParam Long idDirector) {
        
        Film film = new Film();
        film.setTitle(title);
        film.setDescription(description);
        film.setReleaseYear(releaseYear);
        film.setLanguageId(languageId);
        film.setOriginalLanguageId(originalLanguageId);
        film.setRentalDuration(rentalDuration);
        film.setRentalRate(rentalRate);
        film.setLength(length);
        film.setReplacementCost(replacementCost);
        film.setRating(rating);
        film.setLastUpdate(lastUpdate);
        film.setIdDirector(idDirector);

        System.out.println(film.getTitle());

        filmRepository.save(film);
        return "Film Sauvegardé";
    }

    @GetMapping(path="/getById")
    public @ResponseBody Film getFilmById(@RequestParam Integer id) {
      return filmRepository.findById(id).orElse(null);
    }
    
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @PutMapping(path = "/update/{id}")
    public @ResponseBody String updateFilm(
            @PathVariable Integer id,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam Integer releaseYear,
            @RequestParam Byte languageId,
            @RequestParam Byte originalLanguageId,
            @RequestParam Byte rentalDuration,
            @RequestParam Double rentalRate,
            @RequestParam Integer length,
            @RequestParam Double replacementCost,
            @RequestParam String rating,
            @RequestParam java.sql.Timestamp lastUpdate,
            @RequestParam Long idDirector) {
        
        Film film = filmRepository.findById(id).orElse(null);
        if (film == null) {
            return "Film non trouvé";
        }

        film.setTitle(title);
        film.setDescription(description);
        film.setReleaseYear(releaseYear);
        film.setLanguageId(languageId);
        film.setOriginalLanguageId(originalLanguageId);
        film.setRentalDuration(rentalDuration);
        film.setRentalRate(rentalRate);
        film.setLength(length);
        film.setReplacementCost(replacementCost);
        film.setRating(rating);
        film.setLastUpdate(lastUpdate);
        film.setIdDirector(idDirector);

        filmRepository.save(film);
        return "Film Mis à jour";
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteFilm(@PathVariable Integer id) {
        filmRepository.deleteById(id);
        return "Film Supprimé";
    }
}
