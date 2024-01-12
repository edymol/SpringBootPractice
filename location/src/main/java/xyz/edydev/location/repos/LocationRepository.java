package xyz.edydev.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import xyz.edydev.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	@Query("SELECT type, COUNT(type) AS type_count\n"
			+ "FROM location\n"
			+ "GROUP BY type;")
	public List<Object[]> findTypeAndTypeCount();
}
