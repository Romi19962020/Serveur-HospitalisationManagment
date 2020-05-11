package com.example.demo.dao;

import com.example.demo.models.ParamedicalService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamedicalServiceDao extends CrudRepository<ParamedicalService,Long> {
}
