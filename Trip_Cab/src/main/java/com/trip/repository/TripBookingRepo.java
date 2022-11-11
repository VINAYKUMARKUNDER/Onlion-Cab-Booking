package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trip.model.TripBooking;

public interface TripBookingRepo extends JpaRepository<TripBooking, Integer>{

}
