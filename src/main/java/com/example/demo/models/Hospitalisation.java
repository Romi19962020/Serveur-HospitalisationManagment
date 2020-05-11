package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
@Entity

public class Hospitalisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hospType;
    private Date date;
    private String cost;

    @OneToOne
    private  Appoitment appoitment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospType() {
        return hospType;
    }

    public void setHospType(String hospType) {
        this.hospType = hospType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Appoitment getAppoitment() {
        return appoitment;
    }

    public void setAppoitment(Appoitment appoitment) {
        this.appoitment = appoitment;
    }
}
