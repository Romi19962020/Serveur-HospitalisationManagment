package com.example.demo.controller;

import com.example.demo.models.Room;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomController {
    
    private RoomService service;

    @Autowired
    public RoomController(RoomService service) {
        this.service = service;
    }

    @GetMapping("/Room/{id}")
    public Room findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/Rooms")
    public Iterable<Room> findAll(){
        return service.findAll();
    }
    
    @PostMapping(value = "/Room")
    public boolean add(@RequestBody Room model){
        return service.save(model);
    }
    
    @PutMapping("/Room")
    public boolean update(@RequestBody Room model){
        return service.save(model);
    }
    
    @DeleteMapping("/Room")
    public void delete(@RequestBody Room model){
        service.delete(model);
    }

    @DeleteMapping("/Room/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
    
}
