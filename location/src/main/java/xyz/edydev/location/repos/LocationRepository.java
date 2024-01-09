package xyz.edydev.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.edydev.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
