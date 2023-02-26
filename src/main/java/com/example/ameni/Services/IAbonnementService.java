package com.example.ameni.Services;

import com.example.ameni.Entities.Abonnement;
import com.example.ameni.Entities.Cours;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Abonnement retrieveAbonnement(Long numAbonnement);
    void remove(Long id);
}