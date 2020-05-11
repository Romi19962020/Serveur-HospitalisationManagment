package com.example.demo.service;

import com.example.demo.dao.HospitalisationDao;
import com.example.demo.models.Hospitalisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HospitalisationService {
    private final HospitalisationDao dao;

    @Autowired
    public HospitalisationService(HospitalisationDao dao) {
        this.dao = dao;
    }

    public boolean save(Hospitalisation model){
        return dao.save(model)!=null;
    }
    
    public Hospitalisation findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Hospitalisation> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Hospitalisation model){
        dao.delete(model);
    }
}
