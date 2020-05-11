package com.example.demo.dao;

import com.example.demo.models.DoctorHeadService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorHeadServiceDao extends CrudRepository<DoctorHeadService,Long> {
}
