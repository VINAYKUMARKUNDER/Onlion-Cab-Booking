package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trip.model.Cab;

public interface CabRepo extends JpaRepository<Cab, Integer>{

}
