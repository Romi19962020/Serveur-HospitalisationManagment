package com.example.demo.dao;

import com.example.demo.models.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomDao extends CrudRepository<Room,Long> {
}
