package com.aliyaa.assignment.mmt.flightDetails.service;

import java.util.List;
import java.util.Optional;


import com.aliyaa.assignment.mmt.flightDetails.entity.FlightDetailsCreate;


public interface FlightDetailsService {

	List<FlightDetailsCreate> findAllFlights();

	FlightDetailsCreate save(FlightDetailsCreate flightDetailsCreate);

	void deleteAll();

	public String deleteByFlightNumber(int flightNumber);

	Optional<?> findByFlightNumber(int flightNumber);

	Optional<FlightDetailsCreate> findById(int flightNum);

}
