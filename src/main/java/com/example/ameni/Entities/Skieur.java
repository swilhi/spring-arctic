package com.example.ameni.Entities;

import javax.persistence.*;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private Long numSkieur;
    private String nomPiste;
    private String nomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToOne
    private Abonnement abonnement;
    @ManyToMany
    Set<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    List<Inscription> inscriptions;
}


