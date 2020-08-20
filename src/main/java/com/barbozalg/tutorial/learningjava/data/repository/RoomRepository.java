package com.barbozalg.tutorial.learningjava.data.repository;

import com.barbozalg.tutorial.learningjava.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository <Room, Long> {
}