/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex33;

import oop.assignment2.ex32.NumberGuesser;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallDetectorTest {

    @Test
    void askBall_set1() {
        MagicBallDetector detector = new MagicBallDetector();
        String actual = detector.askBall( "Will this test work accordingly?");
        String expected1 = "Yes";
        String expected2 = "No";
        String expected3 = "Maybe";
        String expected4 = "Ask again later.";
        if(expected1.equals(actual))
        {
            assertEquals(expected1, actual);
        }
        else if(expected2.equals(actual))
        {
            assertEquals(expected2, actual);
        }
        else if(expected3.equals(actual))
        {
            assertEquals(expected3, actual);
        }
        else
        {
            assertEquals(expected4, actual);
        }
    }

    @Test()
    void askBall_set2() {
        MagicBallDetector detector = new MagicBallDetector();
        String actual = detector.askBall( "Will I be skilled in Java?");
        String expected1 = "Yes";
        String expected2 = "No";
        String expected3 = "Maybe";
        String expected4 = "Ask again later.";
        if(expected1.equals(actual))
        {
            assertEquals(expected1, actual);
        }
        else if(expected2.equals(actual))
        {
            assertEquals(expected2, actual);
        }
        else if(expected3.equals(actual))
        {
            assertEquals(expected3, actual);
        }
        else
        {
            assertEquals(expected4, actual);
        }
    }
}