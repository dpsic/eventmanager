package com.example.projet_event.Api;

import com.example.projet_event.Entity.Représenter;
import com.example.projet_event.Entity.Theme;
import com.example.projet_event.services.MapVAlidationErrorService;
import com.example.projet_event.services.RepresenterServices;
import com.example.projet_event.services.ThemeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api/representers")
public class RepresenterControleur {

@Autowired
        RepresenterServices representerServices;
    @Autowired
    MapVAlidationErrorService mapVAlidationErrorService;
        @PostMapping("")
        public ResponseEntity<?> saverepresenter(@Valid @RequestBody Représenter representerSer, BindingResult result){
            ResponseEntity<?> errorMap = mapVAlidationErrorService.MapValidationService(result);
            if(errorMap != null) return errorMap;
            Représenter représenter1=representerServices.saverepresenter(representerSer);
            return new ResponseEntity<Représenter>(représenter1, HttpStatus.OK);
}

        @GetMapping("")
        public List<Représenter> getAll()
        {

            return  representerServices.getALL();
        }



}
