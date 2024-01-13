package xyz.edydev.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.edydev.flightreservation.dto.ReservationRequest;
import xyz.edydev.flightreservation.entities.Flight;
import xyz.edydev.flightreservation.entities.Passenger;
import xyz.edydev.flightreservation.entities.Reservation;
import xyz.edydev.flightreservation.repos.FlightRepository;
import xyz.edydev.flightreservation.repos.PassengerRepository;
import xyz.edydev.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        Long flightId = request.getFlightId();
        Flight flight = flightRepository.findById(flightId).orElse(null);

        if (flight != null) {
            Passenger passenger = new Passenger();
            passenger.setFirstName(request.getPassengerFirstName());
            passenger.setLastName(request.getPassengerLastName());
            passenger.setPhone(request.getPassengerPhone());
            passenger.setEmail(request.getPassengerEmail());

            Passenger savedPassenger = passengerRepository.save(passenger);

            Reservation reservation = new Reservation();
            reservation.setFlight(flight);
            reservation.setPassenger(savedPassenger);
            reservation.setCheckedIn(false);

            return reservationRepository.save(reservation);
        } else {
            // Handle the case where the flight is not found
            return null;
        }
    }
}
