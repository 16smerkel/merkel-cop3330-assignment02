/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex30;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        for(int i = 0; i < 13; i++)
        {
            for(int j = 0; j < 13; j++)
            {
                double theAnswer = i * j;
                if(theAnswer / 10 < 1)
                {
                    int theInt = (int) theAnswer;
                    System.out.print(" " + theInt + "   ");
                }
                else if(theAnswer / 10 < 10 && ((i) * (j+1) > 90) && ((i) * (j+1) < 100))
                {
                    int theInt = (int) theAnswer;
                    System.out.print(theInt + "   ");
                }
                else if(theAnswer / 10 < 10 && ((i+1) * (j+1)/ 10 > 10))
                {
                    int theInt = (int) theAnswer;
                    System.out.print(theInt + "  ");
                }
                else if(theAnswer / 10 < 10)
                {
                    int theInt = (int) theAnswer;
                    System.out.print(theInt + "   ");
                }
                else {
                    int theInt = (int) theAnswer;
                    System.out.print(theInt + "  ");
                }
            }
            System.out.println("");
        }
    }
}