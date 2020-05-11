package com.example.demo.service;


import com.example.demo.dao.ConsultationDao;
import com.example.demo.models.Consultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsultationService {
    private final ConsultationDao dao;

    @Autowired
    public ConsultationService(ConsultationDao dao) {
        this.dao = dao;
    }

    public Consultation save(Consultation model){
        return dao.save(model);
    }
    
    public Consultation findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Consultation> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Consultation model){
        dao.delete(model);
    }
}
