package com.kodilla.good.patterns.challenges.flightsearchservice;

import java.time.LocalTime;

public class Flight {

    private int flightNo;
    private LocalTime departureTime;
    private Airport departureAirport;
    private LocalTime arrivalTime;
    private Airport arrivalAirport;

    public Flight(int flightNo, LocalTime departureTime, Airport departureAirport, LocalTime arrivalTime, Airport arrivalAirport) {
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.departureAirport = departureAirport;
        this.arrivalTime = arrivalTime;
        this.arrivalAirport = arrivalAirport;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public Airport getDepartureAiport() {
        return departureAirport;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNo != flight.flightNo) return false;
        if (departureTime != null ? !departureTime.equals(flight.departureTime) : flight.departureTime != null)
            return false;
        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        if (arrivalTime != null ? !arrivalTime.equals(flight.arrivalTime) : flight.arrivalTime != null) return false;
        return arrivalAirport != null ? arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        int result = flightNo;
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNo='" + flightNo + '\'' +
                ", departureTime=" + departureTime +
                ", departureAiport='" + departureAirport + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}
