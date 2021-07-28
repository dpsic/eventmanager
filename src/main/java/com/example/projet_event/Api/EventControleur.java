package com.example.projet_event.Api;

import com.example.projet_event.Dao.EventRepo;
import com.example.projet_event.Entity.Event;
import com.example.projet_event.Entity.Représenter;
import com.example.projet_event.services.EventServices;
import com.example.projet_event.services.EventServicesImp;
import com.example.projet_event.services.MapVAlidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventControleur {
@Autowired
    EventServices eventservices;
    @Autowired
    MapVAlidationErrorService mapVAlidationErrorService;
    @PostMapping("")
        public ResponseEntity<?>  saveEvent(@Valid @RequestBody Event event, BindingResult result){
        ResponseEntity<?> errorMap = mapVAlidationErrorService.MapValidationService(result);
        if(errorMap != null) return errorMap;
        Event event1=eventservices.saveEvent(event);
        return new ResponseEntity<Event>(event1, HttpStatus.OK);
         }

@GetMapping("")
     public List<Event> getALL(){
        return eventservices.getALL();
}
}
