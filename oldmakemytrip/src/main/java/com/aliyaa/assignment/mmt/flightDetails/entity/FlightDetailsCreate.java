package com.aliyaa.assignment.mmt.flightDetails.entity;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Component
@Entity
@Table(name="flight_details")
public class FlightDetailsCreate {
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="flight_number")
	private List<FareDetails> fareDetails;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="flight_number")
	private int flightNumber;
	
	@Column(name="airlines", nullable=false)
	private String airlines;
	
	 @JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="departing_date", nullable=false)
	private Date departingDate;
	 
	 @JsonFormat(pattern="HH:mm:ss")
		@Column(name="departing_time", nullable=false)
		private Date departingTime;
		
	
	 public Date getDepartingDate() {
		return departingDate;
	}


	public void setDepartingDate(Date departingDate) {
		this.departingDate = departingDate;
	}


	public Date getArrivalDate() {
		return arrivalDate;
	}


	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	@JsonFormat(pattern="HH:mm:ss")
	@Column(name="arrival_time",nullable=false)
	private Date arrivalTime;
	 		
	 @JsonFormat(pattern="yyyy-MM-dd")
		@Column(name="arrival_Date",nullable=false)
		private Date arrivalDate;
	
	


	public List<FareDetails> getFareDetails() {
		return fareDetails;
	}


	public void setFareDetails(List<FareDetails> fareDetails) {
		this.fareDetails = fareDetails;
	}




	public FlightDetailsCreate(List<FareDetails> fareDetails,  String airlines, Date departingDate,
			Date departingTime, Date arrivalTime, Date arrivalDate, String source, String destination) {
		super();
		this.fareDetails = fareDetails;
			this.airlines = airlines;
		this.departingDate = departingDate;
		this.departingTime = departingTime;
		this.arrivalTime = arrivalTime;
		this.arrivalDate = arrivalDate;
		this.source = source;
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "FlightDetailsCreate [fareDetails=" + fareDetails + ", flightNumber=" + flightNumber + ", airlines="
				+ airlines + ", departingDate=" + departingDate + ", departingTime=" + departingTime + ", arrivalTime="
				+ arrivalTime + ", arrivalDate=" + arrivalDate + ", source=" + source + ", destination=" + destination
				+ "]";
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	
	public FlightDetailsCreate() {
		super();
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public Date getDepartingTime() {
		return departingTime;
	}

	public void setDepartingTime(Date departingTime) {
		this.departingTime = departingTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Column(name="source", nullable=false)
	private String source;
	
	@Column(name="destination", nullable=false)
	private String destination;
	
	

}
