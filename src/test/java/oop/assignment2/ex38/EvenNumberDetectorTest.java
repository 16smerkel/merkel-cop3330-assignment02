/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex38;

import oop.assignment2.ex37.PasswordGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberDetectorTest {

    @Test
    void showTheEven_set1() {
        EvenNumberDetector detector = new EvenNumberDetector();
        String actual = detector.showTheEven("1 2 3 4 5 6 7 8");
        String expected = "The even numbers are 2 4 6 8 ";
        assertEquals(expected, actual);
    }

    @Test
    void showTheEven_set2() {
        EvenNumberDetector detector = new EvenNumberDetector();
        String actual = detector.showTheEven("11 12 13 14 15 55 66 77 444 450 446");
        String expected = "The even numbers are 12 14 66 444 450 446 ";
        assertEquals(expected, actual);
    }
}