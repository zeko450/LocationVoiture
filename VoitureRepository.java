package com.example.locationvoiture.repository;

import com.example.locationvoiture.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
}

