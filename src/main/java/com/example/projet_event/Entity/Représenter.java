package com.example.projet_event.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Représenter {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    @Column(unique = true, updatable = false)
    @NotBlank(message = "Champ obligatoire")
        private String label;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getLabel() {
            return label;
        }



        public void setLabel(String label) {
            this.label = label;
        }
        public Représenter(Long id, String label) {
            this.id = id;
            this.label = label;
        }

        public Représenter() {
        }
    }
