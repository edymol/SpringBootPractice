package xyz.edydev.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xyz.edydev.flightreservation.dto.ReservationUpdateRequest;
import xyz.edydev.flightreservation.entities.Reservation;
import xyz.edydev.flightreservation.repos.ReservationRepository;

@RestController
@RequestMapping("/reservations")
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@GetMapping("/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Reservation reservation = reservationRepository.findById(id).orElseThrow();
		return reservation;
	}
	
	@RequestMapping(method = {RequestMethod.PUT, RequestMethod.POST})
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepository.findById(request.getId())
		            .orElseThrow();
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckIn());
		Reservation updatedReservation = reservationRepository.save(reservation);
		return updatedReservation;
	}
}