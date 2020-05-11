package com.example.demo.dao;

import com.example.demo.models.Analyses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysesDao extends CrudRepository<Analyses,Long> {
}
