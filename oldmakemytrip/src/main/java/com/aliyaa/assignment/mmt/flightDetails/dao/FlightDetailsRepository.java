package com.aliyaa.assignment.mmt.flightDetails.dao;



import org.springframework.data.jpa.repository.JpaRepository;



//import com.aliyaa.assignment.mmt.flightDetails.entity.FlightDetailsCreate;
import com.aliyaa.assignment.mmt.flightDetails.entity.FlightDetailsCreate;

import org.springframework.stereotype.Repository;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetailsCreate, Integer> {

	
}
