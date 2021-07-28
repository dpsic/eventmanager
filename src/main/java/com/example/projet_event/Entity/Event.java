package com.example.projet_event.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.security.PrivateKey;
import java.text.DateFormat;
import java.util.Date;
import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Champ Obligatoire")
    private String ref;
    @NotBlank(message = "Champ Obligatoire")
    private String obejt;
    @NotNull(message = "Champ Obligatoire")
    @JsonFormat(pattern = "dd-mm-yyyy")
    private Date startdate;
    @NotNull(message = "Champ Obligatoire")
    @JsonFormat(pattern = "dd-mm-yyyy")
    private Date EndDate;

   @ManyToMany
    @JoinTable(name = "REP_EVENT", joinColumns = @JoinColumn(name = "EVENT_ID"), inverseJoinColumns = @JoinColumn(name = "REP_ID"))
   private Set<Représenter> representants;
   private String obs;
    @ManyToOne
    @JoinColumn(name = "ID_TH_EVENT")
    private Theme themEvent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public Set<Représenter> getRepresentants() {
        return representants;
    }

    public void setRepresentants(Set<Représenter> representants) {
        this.representants = representants;
    }

    public Theme getThemEvent() {
        return themEvent;
    }

    public void setThemEvent(Theme themEvent) {
        this.themEvent = themEvent;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getObejt() {
        return obejt;
    }

    public void setObejt(String obejt) {
        this.obejt = obejt;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Event(Long id, String ref, String obejt, Date startdate, Date endDate, String obs) {
        this.id = id;
        this.ref = ref;
        this.obejt = obejt;
        this.startdate = startdate;
        this.EndDate = endDate;
        this.obs = obs;
    }

    public Event() {
    }
}

