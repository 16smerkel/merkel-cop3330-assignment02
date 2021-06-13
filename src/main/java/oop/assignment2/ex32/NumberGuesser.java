/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static boolean guessGame(int choice, String guess)
    {
        int goodToGo = 1;
        int guessCount = 0;
        int theAns = 0;
        Random rand = new Random();
        System.out.println("Let's play Guess the Number.\n" +
                "Pick a difficulty level (1, 2, or 3): ");
        if (choice == 1) {
            theAns = rand.nextInt(10);
        } else if (choice == 2) {
            theAns = rand.nextInt(100);
        } else if (choice == 3) {
            theAns = rand.nextInt(1000);
        }
        System.out.println("I have my number. What's your guess?");
        for (char c : guess.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                guessCount++;
                break;
            }
            goodToGo = 0;
        }
        if (goodToGo != 1) {
            int guessAns = Integer.parseInt(guess);
            if (theAns > guessAns) {
                System.out.println("Too low.");
                guessCount++;
            } else if (theAns < guessAns) {
                System.out.println("Too high.");
                guessCount++;
            } else {
                System.out.println("You got it in " + guessCount + " guesses!");
            }
        }
        while (goodToGo != 2) {
            System.out.println("Guess again: ");
            int theGuess = 0;
            if (choice == 1)
            {
                theGuess = rand.nextInt(10);
            }
            else if (choice == 2)
            {
                theGuess = rand.nextInt(100);
            }
            else
            {
                theGuess = rand.nextInt(1000);
            }
            guess = String.valueOf(theGuess);
            for (char c : guess.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    guessCount++;
                    break;
                }
                goodToGo = 0;
            }
            if (goodToGo != 1) {
                int guessAns = Integer.parseInt(guess);
                if (theAns > guessAns) {
                    System.out.println("Too low.");
                    guessCount++;
                } else if (theAns < guessAns) {
                    System.out.println("Too high.");
                    guessCount++;
                } else {
                    System.out.println("You got it in " + guessCount + " guesses!");
                    goodToGo = 2;
                }
            }
        }
        return true;
    }
}
