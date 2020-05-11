package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motif;
    private String diagnostic;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;

    @OneToOne
    private Hospitalisation hospitalisation;

    @OneToOne
    private Appoitment appoitment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Hospitalisation getHospitalisation() {
        return hospitalisation;
    }

    public void setHospitalisation(Hospitalisation hospitalisation) {
        this.hospitalisation = hospitalisation;
    }

    public Appoitment getAppoitment() {
        return appoitment;
    }

    public void setAppoitment(Appoitment appoitment) {
        this.appoitment = appoitment;
    }
}
