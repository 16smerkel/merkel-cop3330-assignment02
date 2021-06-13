/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex29;

import oop.assignment2.ex28.FiveNumCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentCalculatorTest {

    @Test
    void theFormula_for_real_numbers_set1() {
        InvestmentCalculator detector = new InvestmentCalculator();
        int actual = detector.theFormula(3 );
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    void theFormula_for_real_numbers_set2() {
        InvestmentCalculator detector = new InvestmentCalculator();
        int actual = detector.theFormula(4);
        int expected = 18;
        assertEquals(expected, actual);
    }
}