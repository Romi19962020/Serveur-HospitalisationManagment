package com.example.demo.models;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private int age;
    private String phone;
    private String address;

    @OneToMany
    private Set<Actes>actes;

    @OneToMany
    private Set<Analyses>analyses;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="nurse_patient",
            joinColumns=@JoinColumn(name="nurse_id"),
            inverseJoinColumns=@JoinColumn(name="patient_id"))
    private Set<Patient> patients;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="nurse_consultation",
            joinColumns=@JoinColumn(name="nurse_id"),
            inverseJoinColumns=@JoinColumn(name="consultation_id"))
    private Set<Consultation> consultations;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public Set<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(Set<Consultation> consultations) {
        this.consultations = consultations;
    }
}
