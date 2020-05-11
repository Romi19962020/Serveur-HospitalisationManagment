package com.example.demo.dao;


import com.example.demo.models.Consultation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationDao extends CrudRepository<Consultation,Long> {
}
