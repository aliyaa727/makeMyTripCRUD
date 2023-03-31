package com.aliyaa.assignment.mmt.flightDetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliyaa.assignment.mmt.flightDetails.entity.FareDetails;
@Repository
public interface FareDetailsRepository extends JpaRepository<FareDetails, Integer> {

}
