
package com.tp2.language;
import com.tp2.film.FilmEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name ="language2")
@AllArgsConstructor
@NoArgsConstructor
public class LanguageEntity implements Serializable {

    @Id
    @Column(name="language_id")
    private int lang_id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private Date lastUpdate;

    /*
    @OneToMany(mappedBy = "language")
    private List<FilmEntity> films;
    */
}

