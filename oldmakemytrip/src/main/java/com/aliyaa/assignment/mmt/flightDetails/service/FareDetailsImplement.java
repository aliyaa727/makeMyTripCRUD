package com.aliyaa.assignment.mmt.flightDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliyaa.assignment.mmt.flightDetails.dao.FareDetailsRepository;
import com.aliyaa.assignment.mmt.flightDetails.entity.FareDetails;

@Service
public class FareDetailsImplement implements FareDetailsService {
	@Autowired(required = false)
	private FareDetailsRepository fareDetailSerRepo;

	
	
	public FareDetails saveFareDetail(FareDetails fareDetail)
	
	{
		return fareDetailSerRepo.save(fareDetail);
	}



	@Override
	public List<FareDetails> findAllFares() {
		// TODO Auto-generated method stub
		return fareDetailSerRepo.findAll();
	}



	@Override
	public FareDetails save(FareDetails fareDetails) {
		// TODO Auto-generated method stub
		return fareDetailSerRepo.save(fareDetails);
	}



	@Override
	public Optional<FareDetails> findById(int flightNumber) {
		// TODO Auto-generated method stub
		return fareDetailSerRepo.findById(flightNumber);
	}



	@Override
	public void deleteByFlightNumber(int flightNumber) {
		// TODO Auto-generated method stub
		fareDetailSerRepo.deleteById(flightNumber);
		
	}



	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		fareDetailSerRepo.deleteAll();
	}




	public FareDetailsImplement(FareDetailsRepository fareDetailSerRepo) {
		super();
		this.fareDetailSerRepo = fareDetailSerRepo;
	}


	}
