package com.example.locationvoiture.controller;

import com.example.locationvoiture.entity.Voiture;
import com.example.locationvoiture.repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class VoitureConfig {
    @Bean
    CommandLineRunner commandLineRunner(VoitureRepository voitureRepository) {
        return args -> {
            Voiture voiture1 = new Voiture(
                    "Nissan","Altima",2015,"Beige",195000,99.89);
            Voiture voiture2 = new Voiture(
                    "Honda","Civic",2020,"Blanche",90000,99.89);
            Voiture voiture3 = new Voiture(
                    "Toyota","Matrix",2012,"Bleu",230000,99.89);
            Voiture voiture4 = new Voiture(
                    "Dodge","Caravan",2011,"Rouge",192000,99.89);
            Voiture voiture5 = new Voiture(
                    "Hyundai","Tucson",2013,"Blanche",125000,99.89);
            voitureRepository.saveAll(List.of(voiture1,voiture2,voiture3,voiture4,voiture5));
        };
    }
}