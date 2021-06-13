/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex31;

import oop.assignment2.ex24.AnagramDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {

    @Test
    void heartCheck_set1() {
        HeartRateCalculator detector = new HeartRateCalculator();
        double actual = detector.heartCheck(65, 22);
        double expected = 191.35000000000005; // final bpm
        assertEquals(expected, actual);
    }

    void heartCheck_set2() {
        HeartRateCalculator detector = new HeartRateCalculator();
        double actual = detector.heartCheck(70, 55);
        double expected = 160.25000000000006; // final bpm
        assertEquals(expected, actual);
    }
}