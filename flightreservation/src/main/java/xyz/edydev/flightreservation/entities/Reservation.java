package xyz.edydev.flightreservation.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

/**
 * Represents a reservation in the flight reservation system.
 * Inherits from the {@link AbstractEntity} class.
 */
@Entity
public class Reservation extends AbstractEntity {

    /**
     * Indicates whether the passenger is checked in for the flight.
     */
    private Boolean checkedIn;

    /**
     * The number of bags associated with the reservation.
     */
    private int numberOfBags;

    /**
     * The passenger associated with the reservation.
     * Annotated with {@link OneToOne} for a one-to-one relationship with the {@link Passenger} entity.
     */
    @OneToOne
    private Passenger passenger;

    /**
     * The flight associated with the reservation.
     * Annotated with {@link OneToOne} for a one-to-one relationship with the {@link Flight} entity.
     */
    @OneToOne
    private Flight flight;

    /**
     * Gets the check-in status of the passenger.
     *
     * @return {@code true} if checked in, {@code false} otherwise.
     */
    public Boolean getCheckedIn() {
        return checkedIn;
    }

    /**
     * Sets the check-in status of the passenger.
     *
     * @param checkedIn The check-in status to set.
     */
    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    /**
     * Gets the number of bags associated with the reservation.
     *
     * @return The number of bags.
     */
    public int getNumberOfBags() {
        return numberOfBags;
    }

    /**
     * Sets the number of bags associated with the reservation.
     *
     * @param numberOfBags The number of bags to set.
     */
    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    /**
     * Gets the passenger associated with the reservation.
     *
     * @return The passenger.
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the passenger associated with the reservation.
     *
     * @param passenger The passenger to set.
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * Gets the flight associated with the reservation.
     *
     * @return The flight.
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Sets the flight associated with the reservation.
     *
     * @param flight The flight to set.
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
