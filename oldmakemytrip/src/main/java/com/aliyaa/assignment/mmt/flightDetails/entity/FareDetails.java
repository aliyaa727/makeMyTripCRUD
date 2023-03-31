package com.aliyaa.assignment.mmt.flightDetails.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
	@Entity
	@Table(name="fare_details")
	public class FareDetails {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Column(name="flight_number", nullable=false)
		private int flightNumber;
		
		public FareDetails(int id,int flightNumber, String classType, float fare) {
			super();
			this.id=id;
			this.flightNumber = flightNumber;
			this.classType = classType;
			this.fare = fare;
		}

		@Override
		public String toString() {
			return "FareDetails [id=" + id + ", flightNumber=" + flightNumber + ", classType=" + classType + ", fare="
					+ fare + "]";
		}

		public FareDetails() {
			super();
		}

		public int getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(int flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getClassType() {
			return classType;
		}

		public void setClassType(String classType) {
			this.classType = classType;
		}

		public float getFare() {
			return fare;
		}

		public void setFare(float fare) {
			this.fare = fare;
		}

		@Column(name="Class_type", nullable=false)
		private String classType;
		
		@Column(name="fare", nullable=false)
		private float fare;
		
		

	}


