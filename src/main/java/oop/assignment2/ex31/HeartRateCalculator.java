/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex31;

public class HeartRateCalculator {
    public static double heartCheck(double theRate, double theAge)
    {
        double cur = .55;
        double bpm = 0;
        for (int i = 0; i < 9; i++) {
            bpm = (((220 - theAge) - theRate) * cur) + theRate;
            double curCheck = cur * 100;
            int curPrint = (int) curCheck;
            int bpmCheck = (int) bpm;
            System.out.println(curPrint + "%           | " + bpmCheck + " bpm");
            cur = cur + 0.05;
        }
        return bpm;
    }
}
