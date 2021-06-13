/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex30;

public class MultiplicationTableMaker {
    public static String makeTable(){
        String theTable = "";
        for(int i = 0; i < 13; i++)
        {
            if(i != 0) {
                theTable += ("\n");
            }
            for(int j = 0; j < 13; j++)
            {
                double theAnswer = i * j;
                if(theAnswer / 10 < 1)
                {
                    int theInt = (int) theAnswer;
                    theTable += (" " + theInt + "   ");
                }
                else if(theAnswer / 10 < 10 && ((i) * (j+1) > 90) && ((i) * (j+1) < 100))
                {
                    int theInt = (int) theAnswer;
                    theTable += (theInt + "   ");
                }
                else if(theAnswer / 10 < 10 && ((i+1) * (j+1)/ 10 > 10))
                {
                    int theInt = (int) theAnswer;
                    theTable += (theInt + "  ");
                }
                else if(theAnswer / 10 < 10)
                {
                    int theInt = (int) theAnswer;
                    theTable += (theInt + "   ");
                }
                else {
                    int theInt = (int) theAnswer;
                    theTable += (theInt + "  ");
                }
            }
            theTable += ("");
        }
        return theTable;
    }
}
