/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FiveNumCalculatorTest {
    @Test
    void addFiveNum_for_set1() {
        FiveNumCalculator detector = new FiveNumCalculator();
        int actual = FiveNumCalculator.addFiveNum(1, 2, 3, 4 ,5 );
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void addFiveNum_for_set2() {
        FiveNumCalculator detector = new FiveNumCalculator();
        int actual = detector.addFiveNum(6, 7, 8, 9, 10);
        int expected = 40;
        assertEquals(expected, actual);
    }
}