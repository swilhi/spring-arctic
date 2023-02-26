package com.example.ameni.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.ameni.Entities.Skieur;
import com.example.ameni.Respositories.SkieurRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class SkieurServiceImpl implements IskieurService {

    private SkieurRepo skieurRepo;

    @Override
    public Skieur addSkieur(Skieur s) {
        return skieurRepo.save(s);
    }


    @Override
    public void removeSkieur(Long id) {
        skieurRepo.deleteById(id);
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepo.save(s);
    }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepo.findAll();
    }

    @Override
    public Skieur retrieveSkieur(Long id) {
        return skieurRepo.findById(id).orElse(null);
    }
}