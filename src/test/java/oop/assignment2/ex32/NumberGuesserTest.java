/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex32;

import oop.assignment2.ex31.HeartRateCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGuesserTest {

    @Test
    void guessGame_on_easy() {
        NumberGuesser detector = new NumberGuesser();
        boolean actual = detector.guessGame(1, "2");
        boolean expected = true; // random number was finally guessed in the easiest difficulty
        assertEquals(expected, actual);
    }

    @Test
    void guessGame_on_medium() {
        NumberGuesser detector = new NumberGuesser();
        boolean actual = detector.guessGame(2, "67");
        boolean expected = true; // random number was finally guessed in the medium difficulty
        assertEquals(expected, actual);
    }

    @Test
    void guessGame_on_hard() {
        NumberGuesser detector = new NumberGuesser();
        boolean actual = detector.guessGame(3, "445");
        boolean expected = true; // random number was finally guessed in the hard difficulty
        assertEquals(expected, actual);
    }
}