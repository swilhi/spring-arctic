package com.example.ameni.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.ameni.Entities.Moniteur;
import com.example.ameni.Respositories.MoniteurRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class MoniteurServiceimpl implements IMoniteurService{
    private MoniteurRepo moniteurRepo;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepo.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).orElse(null);
    }

    @Override
    public void remove(Long id) {
        moniteurRepo.deleteById(id);

    }
}