package com.example.projet_event.services;

import com.example.projet_event.Dao.RepresenterRepo;
import com.example.projet_event.Entity.Représenter;
import com.example.projet_event.exceptions.LibbeleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class RepresenterServiceImp implements RepresenterServices{
    @Autowired
RepresenterRepo representerRepo;
    @Override
    public Représenter saverepresenter(Représenter repre) {

        try {
            return representerRepo.save(repre);
        }
        catch(Exception ex)

        {
            throw new LibbeleException("Erreur Fatale");
        }}

    @Override
    public List<Représenter> getALL() {
        return representerRepo.findAll();
    }
}
