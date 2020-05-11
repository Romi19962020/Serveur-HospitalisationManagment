package com.example.demo.dao;

import com.example.demo.models.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDao extends CrudRepository<Doctor,Long> {

}
