package com.tp2.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class FilmController {

    @Autowired
    public FilmServiceImpl fsi;

    @GetMapping("/films")
    public List<FilmEntity> list() {
        return fsi.findAll();
    }

    @PostMapping("/post")
    public String save(@RequestBody FilmEntity film) {
        return fsi.saveFilm(film);
    }

    @GetMapping("/find/{id}")
    public Optional findById (@PathVariable("id") int id) {
        return fsi.findById(id);
    }
}
