/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static String passwordMaker(int minLen, int specCount, int numCount)
    {
        Random rand = new Random();
        String[] specChar = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
        int specLen = specChar.length;
        int finalSpec = specCount;
        int finalNum = numCount;
        System.out.println("What's the minimum length?");
        System.out.println("How many special characters?");
        System.out.println("How many numbers? ");
        List<String> thePassword = new ArrayList<>();
        for (int i = 0; i < minLen; i++) {
            if (numCount != 0 && i % 3 == 1) {
                int newNum = rand.nextInt(10);
                String theNum = String.valueOf(newNum);
                thePassword.add(theNum);
                numCount--;
            } else if (specCount != 0 && i % 3 == 0) {
                int newSpec = rand.nextInt(specLen);
                String theSpec = specChar[newSpec];
                thePassword.add(theSpec);
                specCount--;
            } else {
                int newLetter = rand.nextInt(26);
                char c = (char) (newLetter + 'a');
                String theLetter = ("" + c);
                thePassword.add(theLetter);
            }
        }
        System.out.print("Your password is ");
        String array[] = new String[minLen];
        for(int j =0;j<minLen;j++)
        {
            array[j] = thePassword.get(j);
            System.out.print(array[j]);
        }
        String passWordSuccess = ("Your " + minLen + " character long password with " + finalNum + " numbers and " + finalSpec + " special characters was successfully made.");
        return passWordSuccess;
    }
}
