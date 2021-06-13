/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex40;

import oop.assignment2.ex39.SortingRecordsCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterRecordsCalculatorTest {

    @Test
    void filterRec_set1() {
        FilterRecordsCalculator detector = new FilterRecordsCalculator();
        String actual = detector.filterRec("Jac");
        String expected = "Name                | Position          | Separation Date\n" + "--------------------|-------------------|----------------\n" + "Jake Jacobson-------|Programmer---------|-------------------\n" + "Jacquelyn Jackson---|DBA----------------|-------------------";
        assertEquals(expected, actual);
    }

    @Test
    void filterRec_set2() {
        FilterRecordsCalculator detector = new FilterRecordsCalculator();
        String actual = detector.filterRec("Mi");
        String expected = "Name                | Position          | Separation Date\n" + "--------------------|-------------------|----------------\n" + "Michaela Michaelson-|District Manager---|2015-12-19---------";
        assertEquals(expected, actual);
    }
}