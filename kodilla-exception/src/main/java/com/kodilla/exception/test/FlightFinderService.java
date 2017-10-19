package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinderService {

    static Map<String, Boolean> airportMap = new HashMap<>();

    static {
            airportMap.put("Nowy Jork", true);
            airportMap.put("Moskwa", true);
            airportMap.put("Paryż", false);
            airportMap.put("Londyn", false);
    }

    public boolean findFlight (Flight flight) throws RouteNotFoundException {

        String airportName = flight.getArrivalAirport();
        Boolean x = airportMap.get(flight.getArrivalAirport());

        if (x != null) {
            return x;
        }
        throw new RouteNotFoundException("Lotnisko " + airportName + " nie znajduje się na liście połączeń.");
    }
}
