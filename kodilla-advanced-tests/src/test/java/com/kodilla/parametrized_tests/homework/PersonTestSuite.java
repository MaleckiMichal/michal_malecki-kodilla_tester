package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonsForTestingFeedback()")
    public void testIfGetBMIReturnsProperFeedback(Person input, String expected) {
        assertEquals(expected, input.getBMI());
    }
//
//    @ParameterizedTest
//    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonsInMapForTestingFeedback()")
//    public void testIfGetBMIReturnsProperFeedbackFromMap(Person input, String expected) {
//        assertEquals(expected, input);
//    }

}