package com.example.projet_event.services;

import com.example.projet_event.Entity.Theme;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ThemeServices  {
    Theme SaveTheme(Theme theme);
    List<Theme> getAll();
}
