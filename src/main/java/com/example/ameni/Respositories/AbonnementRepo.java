package com.example.ameni.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ameni.Entities.Abonnement;

@Repository
public interface AbonnementRepo extends JpaRepository <Abonnement,Long> {
}