/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex36;

import oop.assignment2.ex36.StandardCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardCalculatorTest {

    @Test
    void calculateStandard_for_set1() {
        StandardCalculator detector = new StandardCalculator();
        String[] theArray = {"100", "200", "1000", "300", "done"};
        String actual = detector.calculateTheStandard(theArray);
        String expected = "The average is 400.0 The minimum is 100 The maximum is 1000 The standard deviation is 353.55";
        assertEquals(expected, actual);
    }

    @Test
    void calculateStandard_for_set2() {
        StandardCalculator detector = new StandardCalculator();
        String[] theArray = {"10", "2000", "50", "55", "85", "1025", "done"};
        String actual = detector.calculateTheStandard(theArray);
        String expected = "The average is 537.5 The minimum is 10 The maximum is 2000 The standard deviation is 744.99";
        assertEquals(expected, actual);
    }

    @Test
    void calculateStandard_for_set3() {
        StandardCalculator detector = new StandardCalculator();
        String[] theArray = {"2", "64", "done"};
        String actual = detector.calculateTheStandard(theArray);
        String expected = "The average is 33.0 The minimum is 2 The maximum is 64 The standard deviation is 31.00";
        assertEquals(expected, actual);
    }
}