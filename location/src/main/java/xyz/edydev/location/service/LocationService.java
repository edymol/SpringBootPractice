package xyz.edydev.location.service;

import java.util.List;

import xyz.edydev.location.entities.Location;

public interface LocationService {
	Location saveLocation (Location location);
	Location updateLocation (Location location);
	void deleteLocation (Location location);
	Location getocation (int id);
	List<Location> getAllLocations();

}
