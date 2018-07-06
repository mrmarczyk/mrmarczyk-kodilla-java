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

        Boolean isAirportOnTheList = airportMap.get(flight.getArrivalAirport());

        if (isAirportOnTheList != null) {
            return isAirportOnTheList;
        }
        throw new RouteNotFoundException("Lotnisko " + flight.getArrivalAirport() + " nie znajduje się na liście połączeń.");
    }
}
