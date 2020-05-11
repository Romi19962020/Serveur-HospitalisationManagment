package com.example.demo.service;


import com.example.demo.dao.GardeMaladeDao;
import com.example.demo.models.GardeMalade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GardeMaladeService {
    private final GardeMaladeDao dao;

    @Autowired
    public GardeMaladeService(GardeMaladeDao dao) {
        this.dao = dao;
    }

    public boolean save(GardeMalade model){
        return dao.save(model)!=null;
    }
    
    public GardeMalade findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<GardeMalade> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(GardeMalade model){
        dao.delete(model);
    }
}
