package xyz.edydev.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.edydev.location.entities.Location;
import xyz.edydev.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;

	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);

	}

	@Override
	public Location getLocation(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

}
