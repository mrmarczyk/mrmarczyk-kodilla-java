package com.kodilla.good.patterns.challenges.flightsearchservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMap {

    Map<Airport, List<Flight>> departureToFlight = new HashMap<>();

    Map<Airport, List<Flight>> arricalToFlight = new HashMap<>();

    public void addFlight(Flight flight) {
        departureToFlight.putIfAbsent(flight.getDepartureAiport(), new ArrayList<>());
        departureToFlight.get(flight.getDepartureAiport()).add(flight);

        arricalToFlight.putIfAbsent(flight.getArrivalAirport(), new ArrayList<>());
        arricalToFlight.get(flight.getArrivalAirport()).add(flight);
    }

    public List <Flight> getFlightsFrom(Airport airport) {
        return departureToFlight.get(airport);
    }

    public List <Flight> getFlightsTo(Airport airport) {
        return arricalToFlight.get(airport);
    }

}
