package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private Date birthDay;
    private String birthPlace;
    private int sexe;
    private boolean accepted;
    private boolean canceled;
    private String phone;
    private String address;
    private String situation;
    private String profession;
    private String admission;

    @OneToMany
    private Set<Consultation> consultations;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="patient_actes",
            joinColumns=@JoinColumn(name="patient_id"),
            inverseJoinColumns=@JoinColumn(name="actes_id"))
    private Set<Actes> actes;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="patient_analyses",
            joinColumns=@JoinColumn(name="patient_id"),
            inverseJoinColumns=@JoinColumn(name="analyses_id"))
    private Set<Analyses> analyses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAdmission() {
        return admission;
    }

    public void setAdmission(String admission) {
        this.admission = admission;
    }

    public Set<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(Set<Consultation> consultations) {
        this.consultations = consultations;
    }

    public Set<Actes> getActes() {
        return actes;
    }

    public void setActes(Set<Actes> actes) {
        this.actes = actes;
    }

    public Set<Analyses> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(Set<Analyses> analyses) {
        this.analyses = analyses;
    }
}
