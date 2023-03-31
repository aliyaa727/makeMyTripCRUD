package com.aliyaa.assignment.mmt.flightDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

//import com.aliyaa.assignment.mmt.flightDetails.dao.FareDetailsRepository;
import com.aliyaa.assignment.mmt.flightDetails.dao.FlightDetailsRepository;
import com.aliyaa.assignment.mmt.flightDetails.entity.FlightDetailsCreate;

public class FlightDetailsImplement implements FlightDetailsService {
@Autowired(required = false)
private FlightDetailsRepository flightDetailSerRepo;

public FlightDetailsCreate saveFareDetail(FlightDetailsCreate flightDetailCreate)

{
	return flightDetailSerRepo.save(flightDetailCreate);
}



@Override
public FlightDetailsCreate save(FlightDetailsCreate flightDetailsCreate) {
	// TODO Auto-generated method stub
	return flightDetailSerRepo.save(flightDetailsCreate);
}




@Override
public String deleteByFlightNumber(int flightNumber) {
	// TODO Auto-generated method stub
	flightDetailSerRepo.deleteById(flightNumber);
	return "Deleted";
}



@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	flightDetailSerRepo.deleteAll();
	
}



@Override
public Optional<FlightDetailsCreate> findByFlightNumber(int flightNumber) {
	// TODO Auto-generated method stub
	return flightDetailSerRepo.findById(flightNumber);
}



@Override
public List<FlightDetailsCreate> findAllFlights() {
	// TODO Auto-generated method stub
	return flightDetailSerRepo.findAll();
}



@Override
public Optional<FlightDetailsCreate> findById(int flightNum) {
	// TODO Auto-generated method stub
	return Optional.empty();
}
}
