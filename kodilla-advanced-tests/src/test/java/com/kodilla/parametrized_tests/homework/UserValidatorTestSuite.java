package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Mic", "mic", "MICX", "...", ".-_", "___", ".Mi", "Mi.Chal", "_mi44", "333", "m.i_C-h.4l", "aaaaaaaaaaaa1111111111111111111____...---..-.-.AAAA446"})
    public void validateUsernameShouldReturnTrue(String input) {
        assertTrue(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mi", ".M", "Michał", "Mi,chal", "$Mike", "M1c h4l", ""})
    public void validateUsernameShouldReturnFalse(String input) {
        assertFalse(validator.validateUsername(input));
    }

    // empty source also above as value, but wanted to use @EmptySource
    @ParameterizedTest
    @EmptySource
    public void validateUsernameShouldReturnFalseIfIsEmpty(String input) {
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @NullSource
    public void validateUsernameShouldReturnNullPointerException(String input) {
        assertThrows(NullPointerException.class, () -> validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"michal@gmail.c", "michal@gmail.com", "michal@gmail.com.pl",
            "michal.m_m-m-@gmail.com", "michal_m@g-mail.cooabcdeooom.pl", "michal_m@gmail.co-oo-om.pl",
            "michal_m@gmail.com.com-.com.pl", "Michal@gmail.com", "Mich4l@gmail.com", "Mich4l@gma1l.com"})
    public void validateEmailShouldReturnTrue(String input) {
        assertTrue(validator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", ".com", "@g", "@", "@gmail.com", ".@gmail.com", "m.@gmail.com", ".m@gmail.com",
    "mi,chal@gmail.com", "Mi$chal@gmail.com", "michal_m@.com", "michal_m@g_mail.com", "michal_m@g/mail.com",
    "michal_m@gmail.coomabcd", "michal_m@gmail.com.plabcdpl", "michal_m@gmail.", "michal_m@gmail", "michal_m@gmail.co/m",
            "michal_m@gmail.com.p$l", "michal_m@gmail.co%m.pl", "michalgmail.com", "michal@.gmail.com", "mic hal_m@gmail.", " "})
    public void validateEmailShouldReturnFalse(String input) {
        assertFalse(validator.validateEmail(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void validateEmailShouldReturnFalseIfNullOrEmpty(String input) {
        assertFalse(validator.validateEmail(input));
    }

}