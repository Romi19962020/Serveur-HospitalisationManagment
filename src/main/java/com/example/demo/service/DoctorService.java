package com.example.demo.service;

import com.example.demo.dao.DoctorDao;
import com.example.demo.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorService {
    private final DoctorDao dao;

    @Autowired
    public DoctorService(DoctorDao dao) {
        this.dao = dao;
    }

    public boolean save(Doctor model){
        return dao.save(model)!=null;
    }
    
    public Doctor findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Doctor> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Doctor model){
        dao.delete(model);
    }
}
