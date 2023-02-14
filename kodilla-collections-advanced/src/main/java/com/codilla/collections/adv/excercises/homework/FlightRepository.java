package com.codilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Reykjavik"));
        flights.add(new Flight("Warsaw", "Rome"));
        flights.add(new Flight("Warsaw", "Geneva"));
        flights.add(new Flight("Warsaw", "Toulouse"));
        flights.add(new Flight("Reykjavik", "Warsaw"));
        flights.add(new Flight("Rome", "Warsaw"));
        flights.add(new Flight("Geneva", "Warsaw"));
        flights.add(new Flight("Toulouse", "Warsaw"));
        return flights;
    }
}
