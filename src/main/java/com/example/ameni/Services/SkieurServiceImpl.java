package com.example.ameni.Services;

import com.example.ameni.Entities.Abonnement;
import com.example.ameni.Entities.Piste;
import com.example.ameni.Respositories.AbonnementRepo;
import com.example.ameni.Respositories.PisteRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.ameni.Entities.Skieur;
import com.example.ameni.Respositories.SkieurRepo;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
@Slf4j
public class SkieurServiceImpl implements IskieurService {

    private SkieurRepo skieurRepo;
    private PisteRepo pisteRepo;
    private final AbonnementRepo abonnementRepo;

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

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {

        //recuperation des objets
         Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        Assert.notNull(skieur, "skieur not found");
        Piste piste = pisteRepo.findById(numPiste).orElse(null);

        Assert.notNull(piste, "404");


        if (numSkieur != null && numPiste != null) {
            //traitement
            Set<Piste> pistes = skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);
            skieur.getPistes().add(piste);

            //save
            return skieurRepo.save(skieur);
        }
        return null;
    }
    @Override
    public Skieur assignSkieurToAbonnement(Long numSkieur, Long numAbon) {
        // recuperation des objets
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        Assert.notNull(skieur, "skieur not found");
        Abonnement abonnement = abonnementRepo.findById(numAbon).orElse(null);

        Assert.notNull(abonnement, "404");

        if (numSkieur != null && numAbon !=null) {
            //traitement
            skieur.setAbonnement(abonnement);
            return skieurRepo.save(skieur);
        }
        return null;
    }
}