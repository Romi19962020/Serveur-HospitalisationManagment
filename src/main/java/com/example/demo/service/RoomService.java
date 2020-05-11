package com.example.demo.service;


import com.example.demo.dao.RoomDao;
import com.example.demo.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoomService {
    private final RoomDao dao;

    @Autowired
    public RoomService(RoomDao dao) {
        this.dao = dao;
    }

    public boolean save(Room model){
        return dao.save(model)!=null;
    }
    
    public Room findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Room> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Room model){
        dao.delete(model);
    }
}
