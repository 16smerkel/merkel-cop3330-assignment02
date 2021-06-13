/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex37;

import oop.assignment2.ex36.StandardCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void passwordMaker_set1() {
        PasswordGenerator detector = new PasswordGenerator();
        String actual = detector.passwordMaker(8, 5, 2);
        String expected = "Your 8 character long password with 2 numbers and 5 special characters was successfully made.";
        assertEquals(expected, actual);
    }
    @Test
    void passwordMaker_set2() {
        PasswordGenerator detector = new PasswordGenerator();
        String actual = detector.passwordMaker(6, 3, 1);
        String expected = "Your 6 character long password with 1 numbers and 3 special characters was successfully made.";
        assertEquals(expected, actual);
    }

}