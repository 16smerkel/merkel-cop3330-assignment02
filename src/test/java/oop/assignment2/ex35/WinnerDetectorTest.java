/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex35;

import oop.assignment2.ex33.MagicBallDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnerDetectorTest {

    @Test
    void winnerGetter_set1()
    {
        WinnerDetector detector = new WinnerDetector();
        String[] theArray = {"John Smith", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin", " "};
        String actual = detector.winnerGetter( theArray);
        String expected1 = "The winner is... John Smith.";
        String expected2 = "The winner is... Chris Jones.";
        String expected3 = "The winner is... Amanda Cullen.";
        String expected4 = "The winner is... Jeremy Goodwin.";
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

    @Test
    void winnerGetter_set2()
    {
        WinnerDetector detector = new WinnerDetector();
        String[] theArray = {"Homer", "Bart", "Maggie", "Lisa", "Moe", " "};
        String actual = detector.winnerGetter(theArray);
        String expected1 = "The winner is... Homer.";
        String expected2 = "The winner is... Bart.";
        String expected3 = "The winner is... Maggie.";
        String expected4 = "The winner is... Lisa.";
        String expected5 = "The winner is... Moe.";
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
        else if(expected4.equals(actual))
        {
            assertEquals(expected4, actual);
        }
        else
        {
            assertEquals(expected5, actual);
        }
    }
}