package com.example.demo.controller;

import com.example.demo.models.GardeMalade;
import com.example.demo.service.GardeMaladeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GardeMaladeController {
    
    private GardeMaladeService service;

    @Autowired
    public GardeMaladeController(GardeMaladeService service) {
        this.service = service;
    }

    @GetMapping("/GardeMalade/{id}")
    public GardeMalade findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/GardeMalades")
    public Iterable<GardeMalade> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/GardeMalade")
    public boolean add(@RequestBody GardeMalade model){
        return service.save(model);
    }
    
    @PutMapping("/GardeMalade")
    public boolean update(@RequestBody GardeMalade model){
        return service.save(model);
    }
    
    @DeleteMapping("/GardeMalade")
    public void delete(@RequestBody GardeMalade model){
        service.delete(model);
    }

    @DeleteMapping("/GardeMalade/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
