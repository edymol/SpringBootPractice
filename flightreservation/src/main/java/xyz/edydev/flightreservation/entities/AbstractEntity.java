package xyz.edydev.flightreservation.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 * This is the base class for all entities in the application. It provides a
 * common structure for entities with an automatically generated identifier.
 */
@MappedSuperclass
public class AbstractEntity {
	/**
	 * The automatically generated identifier for the entity.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * Gets the identifier of the entity.
	 *
	 * @return The identifier.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the identifier of the entity.
	 *
	 * @param id The identifier to set.
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
