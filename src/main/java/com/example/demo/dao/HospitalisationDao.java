package com.example.demo.dao;

import com.example.demo.models.Hospitalisation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalisationDao extends CrudRepository<Hospitalisation,Long> {
}
