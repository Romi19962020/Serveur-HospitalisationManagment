package com.example.demo.service;

import com.example.demo.dao.ActesDao;
import com.example.demo.models.Actes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActService {
    private final ActesDao dao;

    @Autowired
    public ActService(ActesDao dao) {
        this.dao = dao;
    }

    public boolean save(Actes model){
        return dao.save(model)!=null;
    }
    
    public Actes findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Actes> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Actes model){
        dao.delete(model);
    }
}
