package oop.assignment2.ex26;

import oop.assignment2.ex25.PasswordDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void is_PaymentCalculator_correct_set1() {
        PaymentCalculator detector = new PaymentCalculator();
        double actual = detector.calculateMonthsUntilPaidOff(5000, 12, 100);
        double expected = 70;
        assertEquals(expected, actual);
    }
    @Test
    void is_PaymentCalculator_correct_set2() {
        PaymentCalculator detector = new PaymentCalculator();
        double actual = detector.calculateMonthsUntilPaidOff(6000, 15, 500);
        double expected = 14;
        assertEquals(expected, actual);
    }
}