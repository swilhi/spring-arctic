package com.example.ameni.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ameni.Entities.Skieur;

import java.util.List;
@Repository
public interface SkieurRepo  extends JpaRepository<Skieur,Long> {
    List<Skieur> findByVilleAndNomS(String ville, String nom);
    List<Skieur>findByAbonnementNumAbon(Long numabon);



}