package com.example.ameni.Entities;

import lombok.*;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long numCours;
    private Integer niveau;
    private Float prix;
    private Integer creneau;

    @Enumerated(EnumType.STRING)
    private Support support;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @OneToMany(mappedBy = "cours")
    List<Inscription> inscriptions;
}
