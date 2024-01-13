package xyz.edydev.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xyz.edydev.flightreservation.entities.Flight;
import xyz.edydev.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @PostMapping("/findFlights")
    public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
            @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
            ModelMap modelMap) {
        List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
        modelMap.addAttribute("flights", flights);

        return "displayFlights";
    }
}
