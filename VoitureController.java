package com.example.locationvoiture.controller;

import com.example.locationvoiture.entity.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.locationvoiture.service.VoitureService;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    private VoitureService voitureService;

    @GetMapping("/")
public List<Voiture> liste(){
        return voitureService.listAll();
    }
    @PostMapping("/ajouter")
    public void AjouterVoiture(@RequestBody Voiture voiture){
        voitureService.save(voiture);
    }
}
