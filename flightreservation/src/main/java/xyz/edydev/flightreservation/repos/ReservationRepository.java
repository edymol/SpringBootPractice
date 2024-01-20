package xyz.edydev.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.edydev.flightreservation.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
