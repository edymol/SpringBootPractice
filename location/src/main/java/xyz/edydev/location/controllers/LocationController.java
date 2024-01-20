package xyz.edydev.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.ServletContext;
import xyz.edydev.location.entities.Location;
import xyz.edydev.location.repos.LocationRepository;
import xyz.edydev.location.service.LocationService;
import xyz.edydev.location.util.EmailUtili;
import xyz.edydev.location.util.ReportUtil;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@Autowired
	LocationRepository repository;
	
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext sc;
	
	@Autowired
	EmailUtili email;
	
	@GetMapping("/showCreate")
	public String showCreate(ModelMap modelMap) {
		modelMap.addAttribute("location", new Location());
		return "createLocation";
	}
	
	@PostMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved= service.saveLocation(location);
		String msg = "Location Saved with id: " + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		email.sendEmail("etestered@gmail.com", "Location Created", "You have successfully created a location");
		return "createLocation";
	}
	
	@GetMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap) {
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations"; 
    }
	
	@GetMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
	    Location location = service.getLocation(id);
	    service.deleteLocation(location);
	    List<Location> locations = service.getAllLocations();
	    modelMap.addAttribute("locations", locations);
	    return "displayLocations";
	}
	@GetMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = service.getLocation(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}
	@PostMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
	    service.updateLocation(location);
	    List<Location> locations = service.getAllLocations();
	    modelMap.addAttribute("locations", locations);
	    return "displayLocations"; 
	}
	
	@GetMapping("/generateReport")
	public String generateReport() {
		String path = sc.getRealPath("/");
		List<Object[]> data = repository.findTypeAndTypeCount();
		reportUtil.generatePieChart(path, data);
		return "report";
	}

}
