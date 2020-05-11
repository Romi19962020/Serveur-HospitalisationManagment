package com.example.demo.controller;

import com.example.demo.models.Actes;
import com.example.demo.service.ActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActsController {

    private ActService service;

    @Autowired
    public ActsController(ActService service) {
        this.service = service;
    }

    @GetMapping("/Act/{id}")
    public Actes findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("/Acts")
    public Iterable<Actes> findAll(){
        return service.findAll();
    }

    @PostMapping("/Act")
    public boolean add(@RequestBody Actes model){
        return service.save(model);
    }

    @PutMapping("/Act")
    public boolean update(@RequestBody Actes model){
        return service.save(model);
    }

    @DeleteMapping("/Act")
    public void delete(@RequestBody Actes model){
        service.delete(model);
    }

    @DeleteMapping("/Act/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

}
