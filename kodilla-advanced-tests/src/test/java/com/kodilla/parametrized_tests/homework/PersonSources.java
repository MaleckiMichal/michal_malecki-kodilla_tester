package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePersonsForTestingFeedback() {
        return Stream.of(
                Arguments.of(new Person(1.62, 38), "Very severely underweight"),
                Arguments.of(new Person(1.6, 39.4), "Severely underweight"),
                Arguments.of(new Person(1.7, 46.25), "Underweight"),
                Arguments.of(new Person(1.62, 49.6), "Normal (healthy weight)"),
                Arguments.of(new Person(1.71, 77), "Overweight"),
                Arguments.of(new Person(1.68, 90), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.9, 140), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.95, 160), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.47, 100), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.83, 200), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.9, 216.6), "Obese Class VI (Hyper Obese)"),
                Arguments.of(new Person(1.9, 250), "Obese Class VI (Hyper Obese)")
        );
    }

//    static Map<Person, String> providePersonsInMapForTestingFeedback() {
//        return new HashMap<Person, String>() {{
//            put(new Person(1.62, 38), "Very severely underweight");
//            put(new Person(1.6, 39.4), "Severely underweight");
//            put(new Person(1.7, 46.25), "Underweight");
//            put(new Person(1.62, 49.6), "Normal (healthy weight)");
//            put(new Person(1.71, 77), "Overweight");
//            put(new Person(1.68, 90), "Obese Class I (Moderately obese)");
//            put(new Person(1.9, 140), "Obese Class II (Severely obese)");
//            put(new Person(1.95, 160), "Obese Class III (Very severely obese)");
//            put(new Person(1.47, 100), "Obese Class IV (Morbidly Obese)");
//            put(new Person(1.83, 200), "Obese Class V (Super Obese)");
//            put(new Person(1.9, 216.6), "Obese Class VI (Hyper Obese)");
//            put(new Person(1.9, 250), "Obese Class VI (Hyper Obese)");
//        }};
//    }
}