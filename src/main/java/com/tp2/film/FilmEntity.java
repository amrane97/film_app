package com.tp2.film;

import com.sun.istack.NotNull;
//import com.tp2.language.LanguageEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="film2")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmEntity implements Serializable {

    LocalDate current = LocalDate.now();
    int currentYear = current.getYear();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "film_id")
    private int film_id;

    @Column (name = "title")
    @NotNull
    private String title;

    @Column (name = "description")
    @NotNull
    private String description;

    @Column (name = "release_year")
    @NotNull
    @Min(value = 1900 , message = "annee est trop anterieure")
    private int releaseYear;

    /*
    @ManyToOne
    @JoinColumn(name = "language_id")
    private LanguageEntity language;
    */
}
