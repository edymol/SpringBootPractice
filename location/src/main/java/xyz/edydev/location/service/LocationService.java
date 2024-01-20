package xyz.edydev.location.service;

import java.util.List;

import org.springframework.stereotype.Service;

import xyz.edydev.location.entities.Location;

@Service
public interface LocationService {
	Location saveLocation (Location location);
	Location updateLocation (Location location);
	void deleteLocation (Location location);
	Location getLocation (int id);
	List<Location> getAllLocations();

}
   