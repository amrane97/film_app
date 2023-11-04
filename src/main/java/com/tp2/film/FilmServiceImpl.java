package com.tp2.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService{

    @Autowired
    private Filmblabla filmblabla;

    @Override
    public String saveFilm(FilmEntity film) {
        filmblabla.save(film);
        return "OK";
    }

    @Override
    public Optional findById(int id) {
        return filmblabla.findById(id);
    }

    @Override
    public List<FilmEntity> findAll() {
        return filmblabla.findAll();
    }
}
