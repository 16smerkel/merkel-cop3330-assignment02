/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex29;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the rate of return?");
        String theReturn = scanner.nextLine();
        int goodToGo = 0;
        while(goodToGo == 0)
        {
            for (int i = 0; i < theReturn.length(); i++) {
                char theOne = theReturn.charAt(i);
                if (theOne == '0' && i == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    goodToGo = 0;
                    System.out.println("What is the rate of return?");
                    theReturn = scanner.nextLine();
                    break;
                }
                if (Character.isAlphabetic(theOne)) {
                    System.out.println("Sorry. That's not a valid input.");
                    goodToGo = 0;
                    System.out.println("What is the rate of return?");
                    theReturn = scanner.nextLine();
                    break;
                }
                goodToGo = 1;
            }
        }
        int theRate = Integer.parseInt(theReturn);
        theRate = theFormula(theRate);
        System.out.println("It will take " + theRate + " years to double your initial investment.");
    }
    public static int theFormula(int theRate){
        theRate = 72/theRate;
        return theRate;
    }
}

