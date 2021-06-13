/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EmployeeDetectorTest {

    @Test
    void employeeRemoval_set1() {
        EmployeeDetector detector = new EmployeeDetector();
        String[] actual = EmployeeDetector.employeeRemoval("Jackie Jackson");
        String[] expected = {"John Smith", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        assertArrayEquals(expected, actual);
    }

    @Test
    void employeeRemoval_set2() {
        EmployeeDetector detector = new EmployeeDetector();
        String[] actual = EmployeeDetector.employeeRemoval("Amanda Cullen");
        String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "Jeremy Goodwin"};
        assertArrayEquals(expected, actual);
    }

    @Test
    void employeeRemoval_set3() {
        EmployeeDetector detector = new EmployeeDetector();
        String[] actual = EmployeeDetector.employeeRemoval("Chris Jones");
        String[] expected = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};
        assertArrayEquals(expected, actual);
    }
}