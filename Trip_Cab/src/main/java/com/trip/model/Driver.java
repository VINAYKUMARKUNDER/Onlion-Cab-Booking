package com.trip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	private String lienceNo;
	private float rating;
	
	private Cab cab;
	
	

}
