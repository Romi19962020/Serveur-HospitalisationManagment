package com.example.demo.service;

import com.example.demo.dao.AppoitmentDao;
import com.example.demo.models.Appoitment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppoitmentService {
    private final AppoitmentDao dao;

    @Autowired
    public AppoitmentService(AppoitmentDao dao) {
        this.dao = dao;
    }

    public boolean save(Appoitment model){
        return dao.save(model)!=null;
    }
    
    public Appoitment findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Appoitment> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Appoitment model){
        dao.delete(model);
    }
}
