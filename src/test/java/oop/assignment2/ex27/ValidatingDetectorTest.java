/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidatingDetectorTest {

    @Test
    void validateInput_returns_0_for_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateInput("J","", "ABCDE", "A12-1234");
        int expected = 0; // 0 means errors
        assertEquals(expected, actual);
    }
    @Test
    void validateInput_returns_1_for_no_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateInput("John","Johnson", "55555", "TK-4321");
        int expected = 1; // 1 means no errors
        assertEquals(expected, actual);
    }

    @Test
    void validateFirst_returns_0_for_error() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateFirst("K");
        int expected = 0; // 0 means errors
        assertEquals(expected, actual);
    }

    @Test
    void validateFirst_returns_1_for_no_error() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateFirst("Jake");
        int expected = 1; // 1 means no errors
        assertEquals(expected, actual);
    }

    @Test
    void validateLast_returns_0_for_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateLast("");
        int expected = 0; // 0 means errors
        assertEquals(expected, actual);
    }

    @Test
    void validateLast_returns_1_for_no_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateLast("Sosa");
        int expected = 1; // 1 means no errors
        assertEquals(expected, actual);
    }

    @Test
    void validateZip_returns_0_for_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateZip("ABCDE");
        int expected = 0; // 0 means errors
        assertEquals(expected, actual);
    }

    @Test
    void validateZip_returns_1_for_no_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateZip("34032");
        int expected = 1; // 1 means no errors
        assertEquals(expected, actual);
    }

    @Test
    void validateID_returns_0_for_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateID( "A12-1234");
        int expected = 0; // 0 means errors
        assertEquals(expected, actual);
    }

    @Test
    void validateID_returns_1_for_no_errors() {
        ValidatingDetector detector = new ValidatingDetector();
        int actual = detector.validateID("TK-4321");
        int expected = 1; // 1 means no errors
        assertEquals(expected, actual);
    }
}
