package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineInvalidNumbers.csv", numLinesToSkip = 1, delimiter = ':')
    public void howManyWinsShouldThrowInvalidNumbersException(String input) {
        String[] numbersAsStringArray = input.split(",");
        Set<Integer> invalidNumbers = new HashSet<>();
        for (String numberToBeConvertedToInt : numbersAsStringArray) {
            int number = Integer.parseInt(numberToBeConvertedToInt);
            invalidNumbers.add(number);
        }
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidNumbers));
    }

    /* I just wanted to use @NullAndEmptySource (test below) but also added empty source in test above to throw exact
    exception - InvalidNumbersException for this source (no numbers are also wrong numbers) */

    @ParameterizedTest
    @NullAndEmptySource
    public void howManyWinsShouldThrowException(Set<Integer> input) {
        assertThrows(Exception.class, () -> gamblingMachine.howManyWins(input));
    }

    // Additional test below to invoke exact exception - NullPointerException

    @ParameterizedTest
    @NullSource
    public void howManyWinsShouldThrowNullPointerException(Set<Integer> input) {
        assertThrows(NullPointerException.class, () -> gamblingMachine.howManyWins(input));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineValidNumbers.csv", numLinesToSkip = 1, delimiter = ':')
    public void howManyWinsShouldReturnProperNumberOfMatches(String input) throws InvalidNumbersException {
        String[] numbersAsStringArray = input.split(",");
        Set<Integer> validNumbers = new HashSet<>();
        for (String numberToBeConvertedToInt : numbersAsStringArray) {
            int number = Integer.parseInt(numberToBeConvertedToInt);
            validNumbers.add(number);
        }
        Set<Integer> expected = validNumbers
                .stream()
                .filter(number -> gamblingMachine.getComputerNumbers().contains(number))
                .collect(Collectors.toSet());

        System.out.println("input: " + validNumbers + " computer: " + gamblingMachine.getComputerNumbers() + " matched: " + expected);
        assertEquals(expected.size(), gamblingMachine.howManyWins(validNumbers));
    }

}