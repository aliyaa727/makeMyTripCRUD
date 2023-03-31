package com.aliyaa.assignment.mmt.flightDetails.service;

import java.util.List;
import java.util.Optional;

import com.aliyaa.assignment.mmt.flightDetails.entity.FareDetails;

public interface FareDetailsService {

	public List<FareDetails> findAllFares();

	public FareDetails save(FareDetails fareDetails);
	
	public Optional<FareDetails> findById(int flightNumber);

	public void deleteByFlightNumber(int flightNumber);

	public void deleteAll();



}
