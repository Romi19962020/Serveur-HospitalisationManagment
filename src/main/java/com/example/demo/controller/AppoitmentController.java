package com.example.demo.controller;

import com.example.demo.models.Appoitment;
import com.example.demo.service.AppoitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppoitmentController {
    
    private AppoitmentService service;

    @Autowired
    public AppoitmentController(AppoitmentService service) {
        this.service = service;
    }

    @GetMapping("/Appoitment/{id}")
    public Appoitment findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Appoitments")
    public Iterable<Appoitment> findAll(){
        return service.findAll();
    }
    
    @PostMapping("/Appoitment")
    public boolean add(@RequestBody Appoitment model){
        return service.save(model);
    }
    
    @PutMapping("/Appoitment")
    public boolean update(@RequestBody Appoitment model){
        return service.save(model);
    }
    
    @DeleteMapping("/Appoitment")
    public void delete(@RequestBody Appoitment model){
        service.delete(model);
    }

    @DeleteMapping("/Appoitment/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
