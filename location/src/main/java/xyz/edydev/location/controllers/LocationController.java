package xyz.edydev.location.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {
	@GetMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

}
