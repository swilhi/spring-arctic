package com.example.ameni.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ameni.Entities.Inscription;
@Repository
public interface InscriptionRepo extends JpaRepository <Inscription,Long> {
}