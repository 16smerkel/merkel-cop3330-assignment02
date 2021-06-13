/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex35;

import java.util.Random;

public class WinnerDetector {
    public static String winnerGetter(String[] theArray)
    {
        System.out.println("Enter a name:");
        int i = 1;
        String curGuess = "";
        theArray[0] = curGuess;

        while(!curGuess.equals(" "))
        {
            System.out.println("Enter a name:");
            curGuess = theArray[i];
            if(theArray[i+1] == " " || theArray[i] == " ")
            {
                break;
            }
            i++;
        }

        Random rand = new Random();
        int theAns = rand.nextInt(i);
        String winner = ("The winner is... " + theArray[theAns] + ".");
        return winner;
    }
}
