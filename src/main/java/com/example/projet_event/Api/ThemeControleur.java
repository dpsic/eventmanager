package com.example.projet_event.Api;

import com.example.projet_event.Dao.ThemeRepo;
import com.example.projet_event.Entity.Theme;
import com.example.projet_event.exceptions.LibbeleException;
import com.example.projet_event.services.MapVAlidationErrorService;
import com.example.projet_event.services.ThemeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/themes")
public class ThemeControleur {
    @Autowired
    ThemeServices themeService;
    @Autowired
    MapVAlidationErrorService mapVAlidationErrorService;
    @PostMapping("")

    public ResponseEntity<?>  saveTheme(@Valid @RequestBody Theme theme , BindingResult result){

        ResponseEntity<?> errorMap = mapVAlidationErrorService.MapValidationService(result);
        if(errorMap != null) return errorMap;
        Theme theme1=themeService.SaveTheme(theme);
        return new ResponseEntity<Theme>(theme1, HttpStatus.OK);

    }


    @GetMapping("")
 public List<Theme> getAll()
    {
        return  themeService.getAll();
    }


}
