package xyz.edydev.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xyz.edydev.flightreservation.entities.User;
import xyz.edydev.flightreservation.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/showReg")
	public String showRegistrationPage() {
		return "/login/registerUser";
	}

	@PostMapping("/registerUser")
	public String register(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login/login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
	                    ModelMap modelMap) {
	    User user = userRepository.findByEmail(email);
	    if (user != null && user.getPassword().equals(password)) {
	        return "findFlights";
	    } else {
	        modelMap.addAttribute("msg", "Invalid user name or password. Please try again.");
	    }
	    return "login/login";
	}

}
