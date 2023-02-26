package com.example.ameni.Entities;

import  lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
@ToString
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Abonnement implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float prixAbon;
    @Enumerated (EnumType.STRING)
    private TypeAbonnement typeAbonnement;
    @OneToOne
    private Skieur skieur;

}
