package xyz.edydev.flightreservation.entities;

import jakarta.persistence.Entity;

/**
 * Represents a user in the system. Inherits from the {@link AbstractEntity}
 * class.
 */
@Entity
public class User extends AbstractEntity {

	/**
	 * The first name of the user.
	 */
	private String firstName;

	/**
	 * The last name of the user.
	 */
	private String lastName;

	/**
	 * The email address of the user.
	 */
	private String email;

	/**
	 * The password of the user.
	 */
	private String password;

	/**
	 * Gets the first name of the user.
	 *
	 * @return The first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the user.
	 *
	 * @param firstName The first name to set.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of the user.
	 *
	 * @return The last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the user.
	 *
	 * @param lastName The last name to set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email address of the user.
	 *
	 * @return The email address.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email address of the user.
	 *
	 * @param email The email address to set.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the password of the user.
	 *
	 * @return The password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password of the user.
	 *
	 * @param password The password to set.
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}