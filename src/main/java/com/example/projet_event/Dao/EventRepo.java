package com.example.projet_event.Dao;

import com.example.projet_event.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event,Long>{

}
