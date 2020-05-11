package com.example.demo.controller;

import com.example.demo.models.ParamedicalService;
import com.example.demo.service.Paramedical2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParamedicalController {
    
    private Paramedical2Service service;

    @Autowired
    public ParamedicalController(Paramedical2Service service) {
        this.service = service;
    }

    @GetMapping("/ParamedicalService/{id}")
    public ParamedicalService findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/ParamedicalServices")
    public Iterable<ParamedicalService> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/ParamedicalService")
    public boolean add(@RequestBody ParamedicalService model){
        return service.save(model);
    }
    
    @PutMapping("/ParamedicalService")
    public boolean update(@RequestBody ParamedicalService model){
        return service.save(model);
    }
    
    @DeleteMapping("/ParamedicalService")
    public void delete(@RequestBody ParamedicalService model){
        service.delete(model);
    }

    @DeleteMapping("/ParamedicalService/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
