package com.example.ameni.Respositories;

import com.example.ameni.Entities.TypeAbonnement;
import com.example.ameni.Entities.TypeCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.ameni.Entities.Skieur;

import java.util.List;
@Repository
public interface SkieurRepo  extends JpaRepository<Skieur,Long> {

    /*@Query("select s from Skieur s where s.abonnement.typeAbonnement = ?1");*/

    List<Skieur> findByVilleAndNomS(String ville, String nom);
    List<Skieur>findByAbonnementNumAbon(Long numAbon);
    List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement);
    List<Skieur>findByInscriptionCoursTypeCours(TypeCours typeCours);



}