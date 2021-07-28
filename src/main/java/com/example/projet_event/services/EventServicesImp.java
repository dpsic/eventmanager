package com.example.projet_event.services;

import com.example.projet_event.Dao.EventRepo;
import com.example.projet_event.Entity.Event;
import com.example.projet_event.exceptions.LibbeleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EventServicesImp implements EventServices{
    @Autowired
    EventRepo eventRepo;
    @Override
    public Event saveEvent(Event event) {
try {
            return eventRepo.save(event);
        }
        catch(Exception ex)

        {
            throw new LibbeleException("Erreur Fatale");
        }}
    @Override
    public List<Event> getALL() {

        return eventRepo.findAll();
    }
}
