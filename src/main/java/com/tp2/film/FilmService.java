package com.tp2.film;

import java.util.List;
import java.util.Optional;


public interface FilmService {

    String saveFilm(FilmEntity film);

    Optional findById(int id);

    List<FilmEntity> findAll ();

}
