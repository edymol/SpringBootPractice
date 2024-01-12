package xyz.edydev.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import xyz.edydev.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    @Query("SELECT type AS type, COUNT(type) AS typeCount FROM Location GROUP BY type")
    List<Object[]> findTypeAndTypeCount();
}