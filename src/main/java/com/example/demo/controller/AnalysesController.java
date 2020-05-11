package com.example.demo.controller;

import com.example.demo.models.Analyses;
import com.example.demo.service.AnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnalysesController {
    
    private AnalyseService service;

    @Autowired
    public AnalysesController(AnalyseService service) {
        this.service = service;
    }

    @GetMapping("/Analyses/{id}")
    public Analyses findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Analyses")
    public Iterable<Analyses> findAll(){
        return service.findAll();
    }
    
    @PostMapping("/Analyses")
    public boolean add(@RequestBody Analyses model){
        return service.save(model);
    }
    
    @PutMapping("/Analyses")
    public boolean update(@RequestBody Analyses model){
        return service.save(model);
    }
    
    @DeleteMapping("/Analyses")
    public void delete(@RequestBody Analyses model){
        service.delete(model);
    }

    @DeleteMapping("/Analyses/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
