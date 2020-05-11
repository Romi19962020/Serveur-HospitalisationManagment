package com.example.demo.dao;

import com.example.demo.models.Nurse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseDao extends CrudRepository<Nurse,Long> {
}
