package com.example.demo.models;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flag;
    private int bedsAvailable;

    @OneToMany
    private Set<Hospitalisation> hospitalisations;

    @OneToMany
    private Set<Patient> patients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getBedsAvailable() {
        return bedsAvailable;
    }

    public void setBedsAvailable(int bedsAvailable) {
        this.bedsAvailable = bedsAvailable;
    }

    public Set<Hospitalisation> getHospitalisations() {
        return hospitalisations;
    }

    public void setHospitalisations(Set<Hospitalisation> hospitalisations) {
        this.hospitalisations = hospitalisations;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
}
