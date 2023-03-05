package com.example.ameni.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ameni.Entities.Piste;

import java.util.List;
import java.util.Optional;

@Repository
public interface PisteRepo  extends JpaRepository<Piste,Long> {



}