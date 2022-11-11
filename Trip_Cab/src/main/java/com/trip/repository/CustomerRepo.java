package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trip.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
