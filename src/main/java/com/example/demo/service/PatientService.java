package com.example.demo.service;


import com.example.demo.dao.PatientDao;
import com.example.demo.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService {
    private final PatientDao dao;

    @Autowired
    public PatientService(PatientDao dao) {
        this.dao = dao;
    }

    public boolean save(Patient model){
        return dao.save(model)!=null;
    }
    
    public Patient findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Patient> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Patient model){
        dao.delete(model);
    }
}
