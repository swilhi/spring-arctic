package com.example.ameni.Services;

import com.example.ameni.Entities.Cours;
import com.example.ameni.Entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscription (Long numCours);
    void remove(Long id);
}