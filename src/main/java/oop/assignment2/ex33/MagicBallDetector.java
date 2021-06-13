/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex33;

import java.util.Random;

public class MagicBallDetector {
    public static String askBall(String question)
    {
        Random rand = new Random();
        String ballAnswer = "";
        System.out.println("What's your question?");
        int theAns = rand.nextInt(4);
        if(theAns == 0)
        {
            ballAnswer = ("Yes");
        }
        else if(theAns == 1)
        {
            ballAnswer = ("No");
        }
        else if(theAns == 2)
        {
            ballAnswer = ("Maybe");
        }
        else
        {
            ballAnswer = ("Ask again later.");
        }
        return ballAnswer;
    }
}
