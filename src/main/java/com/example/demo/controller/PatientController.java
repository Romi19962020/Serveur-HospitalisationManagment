package com.example.demo.controller;

import com.example.demo.models.Consultation;
import com.example.demo.models.Patient;
import com.example.demo.service.ConsultationService;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class PatientController {
    
    private PatientService service;
    private ConsultationService consultationService;

    @Autowired
    public PatientController(PatientService service, ConsultationService consultationService) {
        this.service = service;
        this.consultationService = consultationService;
    }

    @GetMapping("/Patient/{id}")
    public Patient findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Patients")
    public Iterable<Patient> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/Patient")
    public void add(@RequestBody Patient model){
        Set<Consultation> consultations = new HashSet<>();
        int i=0;
        if (model.getConsultations().size()>0)
            for (Consultation consultation : model.getConsultations()){
                consultations.add(consultationService.save(consultation));
                if (i==model.getConsultations().size()-1){
                    model.setConsultations(consultations);
                    service.save(model);
                }
                i++;
            }
        else
            service.save(model);
    }
    
    @PutMapping("/Patient")
    public boolean update(@RequestBody Patient model){
        return service.save(model);
    }
    
    @DeleteMapping("/Patient")
    public void delete(@RequestBody Patient model){
        service.delete(model);
    }

    @DeleteMapping("/Patient/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
