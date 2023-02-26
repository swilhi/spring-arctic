package com.example.ameni.Entities;

import lombok.*;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    private Integer longeur;
    private Integer pente;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    @ManyToMany(mappedBy = "pistes")
    List<Skieur> skieurs;
}
