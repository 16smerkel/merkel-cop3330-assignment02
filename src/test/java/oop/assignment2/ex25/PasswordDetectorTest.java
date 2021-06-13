package oop.assignment2.ex25;

import oop.assignment2.ex24.AnagramDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordDetectorTest {

    @Test
    void password_detector_returns_very_weak_for_very_weak_password() {
        PasswordDetector detector = new PasswordDetector();
        int actual = detector.passwordValidator("12345");
        int expected = 0; // 0 is very weak
        assertEquals(expected, actual);
    }

    @Test
    void password_detector_returns_weak_for_weak_password() {
        PasswordDetector detector = new PasswordDetector();
        int actual = detector.passwordValidator("abcedef");
        int expected = 1; // 1 is weak
        assertEquals(expected, actual);;
    }

    @Test
    void password_detector_returns_strong_for_strong_password() {
        PasswordDetector detector = new PasswordDetector();
        int actual = detector.passwordValidator("abc123xyz");
        int expected = 2; // 2 is strong
        assertEquals(expected, actual);;
    }

    @Test
    void password_detector_returns_very_strong_for_very_strong_password() {
        PasswordDetector detector = new PasswordDetector();
        int actual = detector.passwordValidator("1337h@xor!");
        int expected = 3; //3 is very strong
        assertEquals(expected, actual);;
    }
}