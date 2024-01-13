package xyz.edydev.flightreservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Flight extends AbstractEntity {

	@Column(name = "flight_number")
	private String flightNumber;

	@Column(name = "operating_airline")
	private String operatingAirline;

	@Column(name = "departure_city")
	private String departureCity;

	@Column(name = "arrival_city")
	private String arrivalCity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_departure")
	private Date dateOfDeparture;

	@Column(name = "estimated_departure_time")
	private Timestamp estimatedDepartureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
}
