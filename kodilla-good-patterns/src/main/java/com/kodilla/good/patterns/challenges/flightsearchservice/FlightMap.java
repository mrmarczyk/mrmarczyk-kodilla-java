package com.kodilla.good.patterns.challenges.flightsearchservice;

import java.util.HashMap;
import java.util.Map;

public class FlightMap {

    Map<Integer, Flight> flightMap = new HashMap<>();

    public Map<Integer, Flight> getFlightMap() {
        return flightMap;
    }

    public void addFlight(Flight flight) {
        flightMap.put(flight.getFlightNo(), flight);
    }

    public void removeFlight(Flight flight) {
        flightMap.remove(flight.getFlightNo());
    }

    @Override
    public String toString() {
        return "FlightMap{" +
                "flightMap=" + flightMap +
                '}';
    }
}
