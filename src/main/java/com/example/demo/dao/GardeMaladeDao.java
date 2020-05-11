package com.example.demo.dao;


import com.example.demo.models.GardeMalade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardeMaladeDao extends CrudRepository<GardeMalade,Long> {
}
