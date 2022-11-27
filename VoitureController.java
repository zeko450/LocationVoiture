package com.example.locationvoiture.controller;

import com.example.locationvoiture.entity.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.locationvoiture.service.VoitureService;

import java.util.List;

@Controller
public class VoitureController {
    @Autowired
    private VoitureService voitureService;

   @GetMapping("/")
    public String welcome(Model model) {
        List<Voiture> listeVoiture = voitureService.listAll();
        model.addAttribute("voiture", new Voiture());
        model.addAttribute("listeVoiture", listeVoiture);
        return "index";
    }
    @PostMapping("/ajouter")
    public void AjouterVoiture(@RequestBody Voiture voiture){
        voitureService.save(voiture);
    }
}
