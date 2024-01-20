package xyz.edydev.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import xyz.edydev.flightreservation.dto.ReservationUpdateRequest;
import xyz.edydev.flightreservation.entities.Reservation;
import xyz.edydev.flightreservation.repos.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@GetMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Reservation reservation = reservationRepository.findById(id).get();
		return reservation;
	}
	
	@PutMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
	    Reservation reservation = reservationRepository.findById(request.getId()).get();
	    reservation.setNumberOfBags(request.getNumberOfBags());
	    
	   // For troubleshooting.  
//	    System.out.println("Value of checkIn in request: " + request.getCheckedIn());


	 // Use the value from the request, or use a default value if not provided
	    reservation.setCheckedIn(request.getCheckedIn());
	    



	    Reservation updatedReservation = reservationRepository.save(reservation);
	    return updatedReservation;
	}
}