package com.tp2.film;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Filmblabla extends JpaRepository<FilmEntity, Integer> {

    FilmEntity findByTitle(String title);

    FilmEntity findByReleaseYear(long id);

}
