package com.aliyaa.assignment.mmt.flightDetails.cont;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aliyaa.assignment.mmt.flightDetails.dao.FlightDetailsRepository;
//import com.aliyaa.assignment.mmt.flightDetails.entity.FareDetails;
import com.aliyaa.assignment.mmt.flightDetails.entity.FlightDetailsCreate;
import com.aliyaa.assignment.mmt.flightDetails.service.FlightDetailsService;

@RestController
public class FlightDetailsController {
	
	@Autowired(required=false)
	private FlightDetailsRepository flightDetailsRepository;
	@Autowired(required = false)
	private FlightDetailsService flightService;
	
	public FlightDetailsService getFlightService() {
		return flightService;
	}

	public void setFlightService(FlightDetailsService flightService) {
		this.flightService = flightService;
	}

	@PostMapping("/flightSave")
	public String insertFlight(@RequestBody FlightDetailsCreate flightDetailsCreate) {
		flightService.save(flightDetailsCreate);
		return "Saved";
	}
	
	public FlightDetailsController(
			FlightDetailsService flightService) {
		super();
		this.flightService = flightService;
	}

	@GetMapping("/getAllFlights")
	public List<FlightDetailsCreate> getFlightDetail()
	{
		return (List<FlightDetailsCreate>) flightService.findAllFlights();
	}
	
	@GetMapping("/getAllFlights/{flightNumber}")
	public Optional<FlightDetailsCreate> findByFlightNumber(@PathVariable("flightNumber") int flightNumber)
	{
		return flightService.findById(flightNumber);
	}
	@DeleteMapping("/deleteFlights/{flightNumber}")
	public String deleteById(@PathVariable("flightNumber") int flightNumber)
	{
		flightService.deleteByFlightNumber(flightNumber);
		return "Deleted flight number" + flightNumber;

	}
	@DeleteMapping("/flightsDelete")
	public String deleteAllFlights(FlightDetailsCreate fareDetailsCreate) {
	flightService.deleteAll();
	return "Deleted All flight";
	}


}
