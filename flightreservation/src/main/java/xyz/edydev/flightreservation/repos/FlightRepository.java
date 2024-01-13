package xyz.edydev.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.edydev.flightreservation.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
