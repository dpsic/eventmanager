package com.example.projet_event.services;
import com.example.projet_event.Entity.Event;
import java.util.List;

public interface EventServices {
  Event saveEvent(Event event) ;
  List<Event>  getALL();

}
