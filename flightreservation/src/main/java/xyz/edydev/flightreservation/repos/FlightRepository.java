package xyz.edydev.flightreservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import xyz.edydev.flightreservation.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query(value = "SELECT * FROM flight "
            + "WHERE departure_city = :departureCity "
            + "AND arrival_city = :arrivalCity "
            + "AND date_of_departure = :dateOfDeparture", nativeQuery = true)
    List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to,
            @Param("dateOfDeparture") Date departureDate);
}
