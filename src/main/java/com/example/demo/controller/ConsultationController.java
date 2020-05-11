package com.example.demo.controller;

import com.example.demo.models.Consultation;

import com.example.demo.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsultationController {
    
    private ConsultationService service;

    @Autowired
    public ConsultationController(ConsultationService service) {
        this.service = service;
    }

    @GetMapping("/Consultation/{id}")
    public Consultation findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Consultations")
    public Iterable<Consultation> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/Consultation")
    public boolean add(@RequestBody Consultation model){
        return service.save(model)!=null;
    }
    
    @PutMapping("/Consultation")
    public boolean update(@RequestBody Consultation model){
        return service.save(model)!=null;
    }
    
    @DeleteMapping("/Consultation")
    public void delete(@RequestBody Consultation model){
        service.delete(model);
    }

    @DeleteMapping("/Consultation/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
