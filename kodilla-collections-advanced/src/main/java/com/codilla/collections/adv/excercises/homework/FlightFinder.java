package com.codilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightFrom(String departure) {
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> flightsFound = new ArrayList<>();
        for (Flight result : flightsTable)
            if (departure == result.getDeparture()) {
                flightsFound.add(result);
            }
        return flightsFound;
    }

    public List<Flight> findFlightTo(String arrival) {
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> flightsFound = new ArrayList<>();
        for (Flight result : flightsTable) {
            if (arrival == result.getArrival()) {
                flightsFound.add(result);
            }
        }
        return flightsFound;
    }

}
