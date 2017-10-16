package com.kodilla.exception.test;

public class RouteNotFoundRunner {

    public static void main(String[] args) {

        Flight wwaAms = new Flight("Warsaw", "Amsterdam");
        FlightFinderService flightFinderService = new FlightFinderService();

        try {
            if (flightFinderService.findFlight(wwaAms)) {
                System.out.print("Lotnisko" + wwaAms.getArrivalAirport() + "jest dostępne.");
            }
        } catch (RouteNotFoundException e) {
            System.err.println("Podałeś błędną nazwę lotniska, podaj poprawną.");
            e.printStackTrace();
        }

    }
}
