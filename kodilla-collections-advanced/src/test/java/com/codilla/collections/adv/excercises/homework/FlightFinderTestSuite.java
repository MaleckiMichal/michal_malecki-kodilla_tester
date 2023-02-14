package com.codilla.collections.adv.excercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom() {
        // given
        //   tutaj pusto (poza flightFinder), bo lista jest stała i w metodzie i tak będzie to samo

        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightFrom("Rome");
        // then
        Flight flightFromRome = new Flight("Rome", "Warsaw");
        List<Flight> flightsExpected = new ArrayList<>();
        flightsExpected.add(flightFromRome);
        assertEquals(flightsExpected, result);
    }

    @Test
    public void testFindFlightTo() {
        // given
        //
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightTo("Reykjavik");
        // then
        Flight flightToReykjavik = new Flight("Warsaw", "Reykjavik");
        List<Flight> flightsExpected = new ArrayList<>();
        flightsExpected.add(flightToReykjavik);
        assertEquals(flightsExpected, result);
    }

}