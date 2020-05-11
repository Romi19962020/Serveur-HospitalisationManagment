package com.example.demo.dao;

import com.example.demo.models.Appoitment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppoitmentDao extends CrudRepository<Appoitment,Long> {
}
