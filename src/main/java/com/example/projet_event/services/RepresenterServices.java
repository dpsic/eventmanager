package com.example.projet_event.services;

import com.example.projet_event.Entity.Event;
import com.example.projet_event.Entity.Représenter;


import java.util.List;

public interface RepresenterServices {

       Représenter saverepresenter(Représenter repre) ;
       List<Représenter> getALL();

    }

