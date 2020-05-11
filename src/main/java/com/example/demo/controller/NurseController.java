package com.example.demo.controller;

import com.example.demo.models.Nurse;
import com.example.demo.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NurseController {
    
    private NurseService service;

    @Autowired
    public NurseController(NurseService service) {
        this.service = service;
    }

    @GetMapping("/Nurse/{id}")
    public Nurse findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Nurses")
    public Iterable<Nurse> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/Nurse")
    public boolean add(@RequestBody Nurse model){
        return service.save(model);
    }
    
    @PutMapping("/Nurse")
    public boolean update(@RequestBody Nurse model){
        return service.save(model);
    }
    
    @DeleteMapping("/Nurse")
    public void delete(@RequestBody Nurse model){
        service.delete(model);
    }

    @DeleteMapping("/Nurse/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
