package com.example.ameni.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ameni.Entities.Moniteur;

import java.util.List;
@Repository
public interface MoniteurRepo extends JpaRepository<Moniteur,Long> {


}