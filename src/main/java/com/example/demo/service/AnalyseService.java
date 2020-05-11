package com.example.demo.service;

import com.example.demo.dao.AnalysesDao;
import com.example.demo.models.Analyses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AnalyseService {
    private final AnalysesDao dao;

    @Autowired
    public AnalyseService(AnalysesDao dao) {
        this.dao = dao;
    }

    public boolean save(Analyses model){
        return dao.save(model)!=null;
    }
    
    public Analyses findById(Long id){
        return dao.findById(id).orElse(null);
    }
    
    public Iterable<Analyses> findAll(){
        return dao.findAll();    
    }
    
    public void  deleteById(Long id){
        dao.deleteById(id);
    }
    
    public void delete(Analyses model){
        dao.delete(model);
    }
}
