package com.example.locationvoiture.repository;

import com.example.locationvoiture.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
  @Query("SELECT v from Voiture v WHERE v.marque LIKE %?1%"
            + " OR v.modele LIKE %?1%"
            + "OR v.couleur LIKE %?1%")
    List<Voiture> findAll(String keyword);
}

