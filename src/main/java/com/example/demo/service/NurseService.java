package com.example.demo.service;

import com.example.demo.dao.NurseDao;
import com.example.demo.models.Nurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NurseService {
    private final NurseDao dao;

    @Autowired
    public NurseService(NurseDao dao) {
        this.dao = dao;
    }

    public boolean save(Nurse model){
        return dao.save(model)!=null;
    }
    
    public Nurse findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Nurse> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Nurse model){
        dao.delete(model);
    }
}
