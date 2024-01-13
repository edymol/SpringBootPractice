package xyz.edydev.flightreservation.entities;

import jakarta.persistence.Entity;

/**
 * Represents a passenger in the flight reservation system.
 * Inherits from the {@link AbstractEntity} class.
 */
@Entity
public class Passenger extends AbstractEntity {

    /**
     * The first name of the passenger.
     */
    private String firstName;

    /**
     * The last name of the passenger.
     */
    private String lastName;

    /**
     * The middle name of the passenger.
     */
    private String middleName;

    /**
     * The email address of the passenger.
     */
    private String email;

    /**
     * The phone number of the passenger.
     */
    private String phone;

    /**
     * Gets the first name of the passenger.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the passenger.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the passenger.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the passenger.
     *
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the middle name of the passenger.
     *
     * @return The middle name.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the middle name of the passenger.
     *
     * @param middleName The middle name to set.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Gets the email address of the passenger.
     *
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the passenger.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone number of the passenger.
     *
     * @return The phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the passenger.
     *
     * @param phone The phone number to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
