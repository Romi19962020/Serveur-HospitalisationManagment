package com.example.demo.controller;

import com.example.demo.models.DoctorHeadService;
import com.example.demo.service.DoctorHead2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorHeadController {

    private DoctorHead2Service service;

    @Autowired
    public DoctorHeadController(DoctorHead2Service service) {
        this.service = service;
    }

    @GetMapping("/DoctorHeadService/{id}")
    public DoctorHeadService findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/DoctorHeadServices")
    public Iterable<DoctorHeadService> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/DoctorHeadService")
    public boolean add(@RequestBody DoctorHeadService model){
        return service.save(model);
    }
    
    @PutMapping("/DoctorHeadService")
    public boolean update(@RequestBody DoctorHeadService model){
        return service.save(model);
    }
    
    @DeleteMapping("/DoctorHeadService")
    public void delete(@RequestBody DoctorHeadService model){
        service.delete(model);
    }

    @DeleteMapping("/DoctorHeadService/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
