package com.example.demo.service;

import com.example.demo.dao.DoctorHeadServiceDao;
import com.example.demo.models.DoctorHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorHead2Service {
    private final DoctorHeadServiceDao dao;

    @Autowired
    public DoctorHead2Service(DoctorHeadServiceDao dao) {
        this.dao = dao;
    }

    public boolean save(DoctorHeadService model){
        return dao.save(model)!=null;
    }
    
    public DoctorHeadService findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<DoctorHeadService> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(DoctorHeadService model){
        dao.delete(model);
    }
}
