package com.example.demo.controller;

import com.example.demo.models.Hospitalisation;
import com.example.demo.service.HospitalisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HospitalisationController {
    
    private HospitalisationService service;

    @Autowired
    public HospitalisationController(HospitalisationService service) {
        this.service = service;
    }

    @GetMapping("/Hospitalisation/{id}")
    public Hospitalisation findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Hospitalisations")
    public Iterable<Hospitalisation> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/Hospitalisation")
    public boolean add(@RequestBody Hospitalisation model){
        return service.save(model);
    }
    
    @PutMapping("/Hospitalisation")
    public boolean update(@RequestBody Hospitalisation model){
        return service.save(model);
    }
    
    @DeleteMapping("/Hospitalisation")
    public void delete(@RequestBody Hospitalisation model){
        service.delete(model);
    }

    @DeleteMapping("/Hospitalisation/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
