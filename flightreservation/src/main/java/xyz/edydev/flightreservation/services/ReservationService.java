package xyz.edydev.flightreservation.services;

import xyz.edydev.flightreservation.dto.ReservationRequest;
import xyz.edydev.flightreservation.entities.Reservation;


public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);
}
