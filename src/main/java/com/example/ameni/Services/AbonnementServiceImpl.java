package com.example.ameni.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.ameni.Entities.Abonnement;
import com.example.ameni.Respositories.AbonnementRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class AbonnementServiceImpl implements IAbonnementService {
    private AbonnementRepo abonnementRepo;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepo.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbonnement) {
        return abonnementRepo.findById(numAbonnement).orElse(null);
    }

    @Override
    public void remove(Long id) {
        abonnementRepo.deleteById(id);

    }
}
