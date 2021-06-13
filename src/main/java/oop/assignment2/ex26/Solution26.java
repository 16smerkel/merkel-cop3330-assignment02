/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex26;
import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your balance?");
        double theBalance = scanner.nextFloat();
        System.out.println("What is the APR on the card (as a percent)?");
        double theAPR = scanner.nextFloat();
        System.out.println("What is the monthly payment you can make?");
        double theMonthlyPay = scanner.nextFloat();
        double numMonths = calculateMonthsUntilPaidOff(theBalance, theAPR, theMonthlyPay);
        System.out.printf("It will take you %.0f months to pay off this card.", numMonths);
    }

    private static double calculateMonthsUntilPaidOff(double b, double APR, double p) {
        double i = (APR/100)/365;
        double step1 = b/p;
        double step2 = 1+i;
        double step3 = Math.pow(step2,30);
        double step4 = 1 - step3;
        double step5 = step1 * step4;
        double step6 = 1 + step5;
        double step7 = Math.log(step6);
        double step8 = Math.log(step2);
        double step9 = step7/step8;
        double numMonths = -(step9/30);
        numMonths = Math.ceil(numMonths);
        return numMonths;
    }
}
