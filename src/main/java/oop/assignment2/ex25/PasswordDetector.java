/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex25;

public class PasswordDetector {
    public static int passwordValidator(String thePassword)
    {
        int rating;
        int charCount = 0;
        int letterCount = 0;
        int numCount = 0;
        int specialCount = 0;
        for(int i = 0; i < thePassword.length(); i++)
        {
            char theOne = thePassword.charAt(i);
            if(Character.isAlphabetic(theOne))
            {
                letterCount++;
            }
            else if(Character.isDigit(theOne))
            {
                numCount++;
            }
            else
            {
                specialCount++;
            }
            charCount++;
        }
        if(charCount >= 8)
        {
            if (numCount == 0)
            {
                // rating = ("weak");
                rating = 1;
            }
            else if(specialCount == 0)
            {
                //rating = ("strong");
                rating = 2;
            }
            else
            {
                //rating = ("very strong");
                rating = 3;
            }
        }
        else
        {
            if(letterCount == 0)
            {
                //rating = ("very weak");
                rating = 0;
            }
            else
            {
                //rating = ("weak");
                rating = 1;
            }
        }
        return rating;
    }
}
