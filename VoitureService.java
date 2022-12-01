package com.example.locationvoiture.service;

import com.example.locationvoiture.entity.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.locationvoiture.repository.VoitureRepository;

import java.util.List;

@Service
@Transactional
public class VoitureService {
    @Autowired
    private VoitureRepository voitureRepository;

    public List<Voiture> listAll(String keyword){
 if (keyword != null) {
            return voitureRepository.findAll(keyword);
        } else {
        return voitureRepository.findAll();
    }
}
    public Voiture FindById(int id){
       return voitureRepository.findById(id).get();
    }
    public void save (Voiture voiture){
        voitureRepository.save(voiture);
    }
}
