package com.example.demo.service;

import com.example.demo.dao.ParamedicalServiceDao;
import com.example.demo.models.ParamedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Paramedical2Service {
    private final ParamedicalServiceDao dao;

    @Autowired
    public Paramedical2Service(ParamedicalServiceDao dao) {
        this.dao = dao;
    }

    public boolean save(ParamedicalService model){
        return dao.save(model)!=null;
    }
    
    public ParamedicalService findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<ParamedicalService> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(ParamedicalService model){
        dao.delete(model);
    }
}
