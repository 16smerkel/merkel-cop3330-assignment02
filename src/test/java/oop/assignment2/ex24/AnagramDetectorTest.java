/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {
        AnagramDetector detector = new AnagramDetector();
        boolean actual = detector.isAnagram("note", "note");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_otherAnagrams() {
        AnagramDetector detector = new AnagramDetector();
        boolean actual = detector.isAnagram("difo", "fido");
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonAnagrams() {
        AnagramDetector detector = new AnagramDetector();
        boolean actual = detector.isAnagram("difo", "god");
        assertFalse(actual);
    }
}