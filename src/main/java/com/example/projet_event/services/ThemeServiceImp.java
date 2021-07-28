package com.example.projet_event.services;

import com.example.projet_event.Dao.ThemeRepo;
import com.example.projet_event.Entity.Theme;
import com.example.projet_event.exceptions.LibbeleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ThemeServiceImp implements ThemeServices {
    @Autowired
    ThemeRepo themeRepo;

    @Override

    public Theme SaveTheme(Theme theme) {
        try {
            return themeRepo.save(theme);
        }
     catch(Exception ex)

    {
        throw new LibbeleException("Erreur Fatale");
    }

}
    @Override
    public List<Theme> getAll() {

        return themeRepo.findAll();
    }
}
