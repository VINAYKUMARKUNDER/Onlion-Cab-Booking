package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trip.model.Driver;

public interface DriverRepo extends JpaRepository<Driver, Integer>{

}
