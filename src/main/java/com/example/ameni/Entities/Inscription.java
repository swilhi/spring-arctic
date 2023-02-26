package com.example.ameni.Entities;

import javax.persistence.ManyToOne;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long numInscription;
    private Integer numSemaine;
    @ManyToOne
    private Cours cours;
    @ManyToOne
    private Skieur skieur;
}
