package com.plesk.learningspring.data.repository;

import com.plesk.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
