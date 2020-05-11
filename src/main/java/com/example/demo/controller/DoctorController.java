package com.example.demo.controller;

import com.example.demo.models.Doctor;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {
    
    private DoctorService service;

    @Autowired
    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @GetMapping("/Doctor/{id}")
    public Doctor findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Doctors")
    public Iterable<Doctor> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/Doctor")
    public boolean add(@RequestBody Doctor model){
        return service.save(model);
    }
    
    @PutMapping("/Doctor")
    public boolean update(@RequestBody Doctor model){
        return service.save(model);
    }
    
    @DeleteMapping("/Doctor")
    public void delete(@RequestBody Doctor model){
        service.delete(model);
    }

    @DeleteMapping("/Doctor/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
