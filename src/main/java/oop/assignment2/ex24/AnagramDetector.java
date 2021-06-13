/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex24;

public class AnagramDetector {
    public boolean isAnagram(String first, String second){
        if(first.length() == 0 || second.length() == 0 || first.length() != second.length())
        {
            return false;
        }
        int theCheck = 0;
        for(int i = 0; i < first.length(); i++)
        {
            for(int j = 0; j < second.length(); j++) {
                char theOne = first.charAt(i);
                char theSec = second.charAt(j);
                if (theOne == theSec) {
                    theCheck++;
                    break;
                }
            }
            if (theCheck != i+1)
            {
                return false;
            }
        }
        return true;
    }
}

