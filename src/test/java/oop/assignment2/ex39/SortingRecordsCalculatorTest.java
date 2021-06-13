/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */

package oop.assignment2.ex39;

import oop.assignment2.ex38.EvenNumberDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingRecordsCalculatorTest {

    @Test
    void sortRecords() {
        SortingRecordsCalculator detector = new SortingRecordsCalculator();
        String actual = detector.sortRecords();
        String expected = "Name                | Position          | Separation Date\n" + "--------------------|-------------------|----------------\n" + "Jacquelyn Jackson---|DBA----------------|-------------------\n" + "Jake Jacobson-------|Programmer---------|-------------------\n" + "John Johnson--------|Manager------------|2016-12-31---------\n" + "Michaela Michaelson-|District Manager---|2015-12-19---------\n" + "Sally Webber--------|Web Developer------|2015-12-18---------\n" + "Tou Xiong-----------|Software Engineer--|2016-10-05---------";
        assertEquals(expected, actual);
    }
}